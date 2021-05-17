package utils;

public class Payload {
	
	public static String dummyPostJson() {
		return "{\r\n"
				+ "\r\n'name': 'John',"
				+ "\r\n'lastname': 'Doe',"
				+ "\r\n'age':30"
				+ "\r\n}";
	}

	public static String azureFirstPost() {
		return "{\r\n"
				+ "    \"columns\": [\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"numeric\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": true,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Id\",\r\n"
				+ "            \"name\": \"OrderID\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"Ascending\",\r\n"
				+ "            \"sortOrder\": 1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"Count\",\r\n"
				+ "            \"dataType\": \"string\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Customer Name\",\r\n"
				+ "            \"name\": \"CustomerName\",\r\n"
				+ "            \"searchable\": true,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"datetimeutc\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Shipped Date\",\r\n"
				+ "            \"name\": \"ShippedDate\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"string\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Shipper City\",\r\n"
				+ "            \"name\": \"ShipperCity\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": false,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": false,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"numeric\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Amount\",\r\n"
				+ "            \"name\": \"Amount\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": false,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"boolean\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Is Shipped\",\r\n"
				+ "            \"name\": \"IsShipped\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"string\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Actions\",\r\n"
				+ "            \"name\": \"Actions\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": false,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": false,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"searchText\": \"\",\r\n"
				+ "    \"skip\": 0,\r\n"
				+ "    \"take\": 5,\r\n"
				+ "    \"counter\": 1,\r\n"
				+ "    \"timezoneOffset\": 180\r\n"
				+ "}";
	}
	
	public static String azureSecondPost() {
		return "{\r\n"
				+ "    \"columns\": [\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"numeric\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": true,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Id\",\r\n"
				+ "            \"name\": \"OrderID\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"Ascending\",\r\n"
				+ "            \"sortOrder\": 1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"Count\",\r\n"
				+ "            \"dataType\": \"string\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Customer Name\",\r\n"
				+ "            \"name\": \"CustomerName\",\r\n"
				+ "            \"searchable\": true,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"datetimeutc\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Shipped Date\",\r\n"
				+ "            \"name\": \"ShippedDate\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"string\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Shipper City\",\r\n"
				+ "            \"name\": \"ShipperCity\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": false,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": false,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"numeric\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Amount\",\r\n"
				+ "            \"name\": \"Amount\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": false,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"boolean\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Is Shipped\",\r\n"
				+ "            \"name\": \"IsShipped\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": true,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": true,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"aggregate\": \"None\",\r\n"
				+ "            \"dataType\": \"string\",\r\n"
				+ "            \"dateDisplayFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateOriginFormat\": \"YYYY-MM-DD\",\r\n"
				+ "            \"dateTimeDisplayFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"dateTimeOriginFormat\": \"YYYY-MM-DDTHH:mm:ss\",\r\n"
				+ "            \"isKey\": false,\r\n"
				+ "            \"isComputed\": false,\r\n"
				+ "            \"label\": \"Actions\",\r\n"
				+ "            \"name\": \"Actions\",\r\n"
				+ "            \"searchable\": false,\r\n"
				+ "            \"sortDirection\": \"None\",\r\n"
				+ "            \"sortOrder\": -1,\r\n"
				+ "            \"sortable\": false,\r\n"
				+ "            \"visible\": true,\r\n"
				+ "            \"filterable\": false,\r\n"
				+ "            \"exportable\": true\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"searchText\": \"\",\r\n"
				+ "    \"skip\": 5,\r\n"
				+ "    \"take\": 5,\r\n"
				+ "    \"counter\": 2,\r\n"
				+ "    \"timezoneOffset\": 180\r\n"
				+ "}";
	}
	
	

}
