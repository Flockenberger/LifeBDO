package at.flockenberger.bdo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class BDOUtil {
	private final static GsonBuilder gsonB = new GsonBuilder();
	private static final Gson gson;
	static {
		gsonB.setPrettyPrinting();
		gson = gsonB.create();
	}

	public static String toJson(Object items) {
		return gson.toJson(items);
	}

	public static <T> T readResponse(String json, Type obj) {
		JsonReader reader = null;
		reader = new JsonReader(new StringReader(json));
		T da = gson.fromJson(reader, obj);
		return da;
	}

	public static void printStringArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static String readFile(String path) throws IOException {
		return new String(Files.readAllBytes(new File(path).toPath()), StandardCharsets.UTF_8);
	}

	public static String splitLast(String str, String split) {
		int index = str.lastIndexOf(split);
		if (index != -1)
			return str.substring(0, index);
		return str;
	}

	public static <T> T toObject(String json, Type obj) {
		JsonReader reader = null;
		reader = new JsonReader(new StringReader(json));
		T da = gson.fromJson(reader, obj);
		return da;
	}

	public static void writeToFile(String toWrite, File f) {
		BufferedWriter wr = null;
		try {
			wr = new BufferedWriter(new FileWriter(f));
			wr.write(toWrite);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				wr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Checks if the given value is in range. If not -1 is returned.
	 * 
	 * @param val the value to check
	 * @param min the min value (in bound)
	 * @param max the max value ( in bound)
	 * @return the value or -1
	 */
	public static int checkRange(int val, int min, int max) {
		return checkRange(val, min, max, -1);
	}

	/**
	 * Checks if the given value is in bounds.
	 * 
	 * @param val   the value to check
	 * @param min   the min (in bound)
	 * @param max   the max (in bound)
	 * @param other should the given value not be in bounds, "other" is returned
	 *              instead.
	 * @return the value or "other"
	 */
	public static int checkRange(int val, int min, int max, int other) {
		if (val < min || val > max)
			return other;
		else if (val >= min && val <= max) {
			return val;
		} else
			return other;
	}

	public static BufferedReader openFile(File f) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return reader;
	}

	public static void closeFile(Reader r) {
		try {
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean containsIgnoreCase(String str, String searchStr) {
		if (str == null || searchStr == null)
			return false;

		final int length = searchStr.length();
		if (length == 0)
			return true;

		for (int i = str.length() - length; i >= 0; i--) {
			if (str.regionMatches(true, i, searchStr, 0, length))
				return true;
		}
		return false;
	}

}
