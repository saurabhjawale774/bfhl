package com.app.dto;

import java.util.Arrays;
public class Data {
	

		private String[] data;

		public Data() {
			// TODO Auto-generated constructor stub
		}

		public Data(String[] data) {
			super();
			this.data = data;
		}

		public String[] getData() {
			return data;
		}

		public void setData(String[] data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return String.format("Data [data=%s]", Arrays.toString(data));
		}

	}


