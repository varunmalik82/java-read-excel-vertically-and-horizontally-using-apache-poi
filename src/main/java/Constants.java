import java.io.File;

public class Constants {

	private Constants() {
		throw new IllegalStateException("LogMessages");
	}

	// MAMINUM NUMBER OF CLASSES WHILE CREATIING DYNAMIC TESTNG

	public static int MAXIMUM_NUMBER_OF_CLASSES = 100;

	// TestData & TestSuite location
	public static String TEST_DATA_PATH = ".//src//test//resources//test-data//";
	public static String TEST_DATA_FOLDER = "//src//test//resources//test-data//";
	public static String TEST_RESULT_FOLDER = "//test-output//";
	public static String TOOL_CONTROL_VALIDATION_FILE = "ToolControlValidation.xlsx";
	public static String TOOL_CONTROL_VALIDATION_RESULT_FILE = "ToolControlValidationResults.xlsx";
	public static final String ANDROID_TEST_DATA_FILE = "Android.xlsx";
	public static final String IOS_TEST_DATA_FILE = "iOS.xlsx";
	public static final String WEB_TEST_DATA_FILE = "Web.xlsx";
	public static final String TEST_DATA_WORKSHEET = "test-data";
	public static final String PLACE_DATA_WORKSHEET = "place-data";
	public static final String TOOL_DETAILS_EXCELSHEET = "ToolDetails.xlsx";
	public static final String INVENTORY_VERIFICATION_TOOL_DETAILS_EXCELSHEET = "InventoryVerificationToolDetails.xlsx";
	public static final String TOOL_CONTROL_VALIDATION_EXCELSHEET = "ToolControlValidation.xlsx";
	public static final String TOOL_CONTROL_E2E_DATA_EXCELSHEET = "E2EToolControlData.xlsx";

	// Tool Details WoorkSheet
	public static final String TOOLS_DETAILS_WORKSHEET = "tools-details";
	public static final String TICK_DETAILS_WORKSHEET = "tick-details";

	// LastRow And LastColumn texts
	public static final String END_OF_ROWS = "EndOfRows";
	public static final String END_OF_COLUMNS = "EndOfColumns";

	// RETRY COUNT
	public static final int DEFAULT_RETRY_COUNT = 2;

	// Column Numbers of test sheet
	public static final int TEST_DATA_COL_NO = 2;
	public static final int RUN_MODE_COL_NO = 3;
	public static final int DESCRIPTION_COL_NO = 4;
	public static final int CLASSNAME_COL_NO = 5;

	public static final String REPORTS_PATH = ".//reports//";

	// Screenshot Folder
	public static final String SCREEN_SHOTS = "./screenshots/";
	public static final String CUSTOM_TEST_DATA_FOLDER = ".//src//test//resources//custom-test-data/";
	public static final String MAIN_TEST_DATA_PATH = ".//src//test//resources//test-data//";

	// Waits
	public static final long WAIT_FOR_1SEC = 1000;
	public static final long WAIT_FOR_2SEC = 2000;
	public static final long WAIT_FOR_3SEC = 3000;
	public static final long WAIT_FOR_4SEC = 4000;
	public static final long WAIT_FOR_6SEC = 6000;
	public static final long WAIT_FOR_10SEC = 10000;

	//
	public static final String UNIQUE_MASTER_KEY_FILE_PATH = ".//src//test//resources//localized-files//UniqueMasterKey.strings";

	public static final String LOCALIZABLE_FILES_FOLDER_PATH = File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "localized-files" + File.separator + "Localizable.strings"
			+ File.separator;
	public static final String PROPERTIES_FOLDER_PATH = File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "properties" + File.separator;
	public static final String IOS_SIM_APP = "/apps/iphone-apps/simulator-app/OpenLink.app";

	public static final String APP_VERSION_PATH = "/src/test/resources/properties/appVersion";
	public static final String APP_PATH = "/apps";
	public static final String ANDROID_APKS_PATH = File.separator + "apps" + File.separator + "android-apks"
			+ File.separator;
	public static final String ANDROID_APKS_PATH_NA_CR = "/apps/android-apks/na_cr";
	public static final String ANDROID_APKS_PATH_TEST = "/apps/android-apks/test";
	public static final String ANDROID_APKS_PATH_STAGE = "/apps/android-apks/stage";
	public static final String ANDROID_APKS_PATH_STAGE_EMEA = "/apps/android-apks/stage_emea";
	public static final String ANDROID_APKS_PATH_STAGE_ANZ = "/apps/android-apks/stage_anz";
	public static final String ANDROID_APKS_PATH_STAGE_REGRESSION = "/apps/android-apks/stage_regression";

	public static final String IOS_APPS_BASE_PATH = "/apps/iphone-apps";
	public static final String IOS_SIMULATOR_APPS_BASE_PATH = "/apps/iphone-apps/simulator-app";
	public static final String IOS_IPA_PATH = "/apps/iphone-apps/device-app/";
	public static final String IOS_IPA_PATH_NA_CR = "/apps/iphone-apps/device-app/na_cr";
	public static final String IOS_IPA_PATH_TEST = "/apps/iphone-apps/device-app/test";
	public static final String IOS_IPA_PATH_STAGE_NA = "/apps/iphone-apps/device-app/stage";
	public static final String IOS_IPA_PATH_STAGE_EMEA = "/apps/iphone-apps/device-app/stage_emea";
	public static final String IOS_IPA_PATH_STAGE_ANZ = "/apps/iphone-apps/device-app/stage_anz";
	public static final String IOS_IPA_PATH_STAGE_REGRESSION = "/apps/iphone-apps/device-app/stage_regression";

	// Application Names
	public static final String ANDROID_NA_APK = "METOpenLink-naCR-debug.apk";
	public static final String ANDROID_STAGE_APK = "METOpenLink-naSTAGE-release.apk";

	public static final String ANDROID_STAGE_EMEA_APK = "METOpenLink-emeaStage-release.apk";
	public static final String ANDROID_STAGE_ANZ_APK = "METOpenLink-anzStage-release.apk";

	public static final String ANDROID_TEST_APK = "METOpenLink-naQA-debug.apk";
	public static final String IOS_APP_NAME = "OpenLink.ipa";
	public static final String IOS_OPENLINK_APP_NAME = "OpenLinkKitApp.ipa";

	public static final String BUNDLE_ID = "com.milwaukeetool.mymilwaukee";
	public static final String BUNDLE_ID_OPENLINK = "com.milwaukeetool.OpenLinkKitApp";

	public static final String ANDROID_TEST_APP_PKG = "com.milwaukeetool.mymilwaukee_TEST";
	public static final String ANDROID_NA_APP_PKG = "com.milwaukeetool.mymilwaukee_NA_CR";
	public static final String ANDROID_STAGE_APP_PKG = "com.milwaukeetool.mymilwaukee_STAGE";
	public static final String ANDROID_PROD_APP_PKG = "com.milwaukeetool.onekey_emea";
	public static final String ANDROID_PROD_HOCKEY_APP_PKG = "com.milwaukeetool.mymilwaukee";
	public static final String ANDROID_STAGE_EMEA_APP_PKG = "com.milwaukeetool.mymilwaukee_STAGE_EMEA";
	public static final String ANDROID_STAGE_ANZ_APP_PKG = "com.milwaukeetool.mymilwaukee_STAGE_ANZ";

	public static final String ANDROID_APP_ACTIVITY = "com.milwaukeetool.mymilwaukee.activity.RouterActivity";
	// public static final String ANDROID_APP_ACTIVITY =
	// "com.milwaukeetool.mymilwaukee.activity.MainActivity";

	public static final String DEFAULT_ENV = "na_cr";
	public static final String DEFAULT_GROUP = "bvt";
	public static final String ENV_TEST = "test";
	public static final String ENV_STAGE = "stage";
	public static final String ENV_CR = "na_cr";
	public static final String ENV_PROD = "prod";
	public static final String ENV_PROD_EMEA = "prod_emea";
	public static final String ENV_STAGE_EMEA = "stage_emea";
	public static final String ENV_STAGE_ANZ = "stage_anz";
	public static final String DEFAULT_EXCEL = "";
	public static final String DEFAULT_CUSTOM_DATA = "n";
	public static final String RUN_ALL_TEST_CASE = "n";
	public static final String RE_RUN_ONLY_FAILED_TEST_CASE = "n";
	public static final String LOCALIZATION_DEFAULT_LANGUAGE = "en-US";

	// Device Configuration
	public static final String DEVICE_ID = "deviceID";
	public static final String DEVICE_NAME = "deviceName";
	public static final String DEVICE_OS_VERSION = "osVersion";

	// Platform Name
	public static final String PLATFORM_IOS = "ios-devices";
	public static final String PLATFORM_ANDROID = "android-devices";
	public static final String PLATFORM__ANDROID = "android";

	// Hockey App
	public static final String HOCKEY_APP_URL = "https://rink.hockeyapp.net/users/sign_in";
	public static final String HOCKEY_USER_ID = "deepanker.kumar@milwaukeetool.com";
	public static final String HOCKEY_USER_PSSWRD = "miP4cvma";

	// Report Archive Locations
	public static final String REPORT_ARCHIVE_LOCATION = "/reportArchive";
	public static final String EXTENT_REPORT_LOCATION = "/ExtentReport.html";
	public static final String EXTENT_REPORT_RENAMED_LOCATION = "/extentReport.html";
	public static final String SCREENSHOTS_FOLDER_LOCATION = "/screenshots";
	public static final String LOG_FINAL_STATUS_LOCATION = "/logFinalStatus.log";

	// Report Email Setup
	public static final String MAIL_FROM_ID = "lochbridgeind@gmail.com";
	public static final String MAIL_FROM_PSSWRD = "Lochbridge@123";
	public static final String REPORT_RECIPIENTS = "alochbridgeind@gmail.com";

	// One Key URL
	public static final String URL_WEB_ONEKEY_CR = "http://onekeycr.milwaukeetool.com/";
	public static final String URL_WEB_ONEKEY_TEST = "https://onekeytest.milwaukeetool.com";
	public static final String URL_WEB_ONEKEY_STAGE = "http://onekeystaging.milwaukeetool.com/";
	public static final String URL_WEB_ONEKEY_PROD = "http://onekey.milwaukeetool.com/";
	public static final String URL_WEB_ONEKEY_STAGE_EMEA = "https://accounts.milwaukeetool.eu/account/login?returnUrl=https://onekeystaging.milwaukeetool.eu/";
	public static final String URL_WEB_ONEKEY_STAGE_ANZ = "https://accounts.milwaukeetools.com.au/account/login?returnUrl=https://onekeystaging.milwaukeetools.com.au/";
	// Browsers
	public static final String BROWSER_WEB_CHROME = "chrome";
	public static final String BROWSER_WEB_EDGE = "edge";
	public static final String BROWSER_WEB_IE = "ie";
	public static final String BROWSER_WEB_FIREFOX = "firefox";
	public static final String DEFAULT_BROWSER = "headless";

	// FLAGS
	public static final String FLAG_YES = "y";
	public static final String FLAG_NO = "n";
	public static final String DEFAULT_FLAG = "y";
	public static final char PROCEED_ON_FAIL_YES = 'Y';
	public static final char PROCEED_ON_FAIL_NO = 'N';

	public static final String NO_DEVICE_CONNECTED = "***** NO DEVICE CONNECTED - PLEASE MAKE SURE AT LEAST ONE DEVICE <OF SELECTED PLATFORM> IS CONNECTED TO THE MACHINE  ******";

	public static final String TEST_DATA_ABSOLUTE_PATH = File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "test-data";
	public static final String TOOL_DETAILS_EXCEL_FILENAME = "MilwaukeeTool-OneKey-Item-Import.xlsx";

	public static final String FILE_DOWNLOADS_PATH_USERS = "Users/";
	public static final String FILE_DOWNLOADS_PATH_PREFIX = "file:/Users/";
	public static final String FILE_DOWNLOADS_PATH_POSTFIX = "/Downloads/";

	public static final String FILE_LOG_FILE_PATH = "/logfile.log";
	public static final String WEB_PLATFORM_RESOURCES_LOCATION = "/webToolReports";
	public static final String TOOL_ALLOCATION_REPORT_FILENAME = "Tool Allocation Report.pdf";
	public static final String TOOL_INVENTORY_AUDIT_REPORT_FILENAME = "Inventory Audit Report.pdf";
	public static final String TOOL_TRANSFER_REPORT_FILENAME = "ToolTransferReport.pdf";
	public static final String TOOL_SPEND_REPORT_FILENAME = "Tool Spend Report.pdf";

	public static final String TOOL_SPEND_REPORT_TITLE = "Tool Spend";
	public static final String TOOL_ALLOCATION_REPORT_TITLE = "Tool Allocation";
	public static final String INVENTORY_AUDIT_REPORT_TITLE = "Inventory Audit";

	public static final int TOOL_SEARCH_REFRESH_COUNTER = 5;

	// formating
	public static final String PASS_TEXT_STRING = "<b><i><font color=\"blue\">PASS</font></b></i>";
	public static final String FAIL_TEXT_STRING = "<b><i><font color=\"red\">FAIL</font></b></i>";
	public static final String EXPECTED_PASS_TEXT_STRING = PASS_TEXT_STRING + "<br><br>{	Expected		:	";
	public static final String EXPECTED_FAIL_TEST_STRING = FAIL_TEXT_STRING + "<br><br>{	Expected		:	";
	public static final String ACTUAL_TEXT_STRING = " }</br>{		Actual&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:	";
	public static final String CLOSING_STRING = " }";
	public static final String TABING_STRING = "&nbsp&nbsp&nbsp&nbsp&nbsp";

	// formating Tool Control Validation
	public static final String ACTUAL_PASS_OK_TEXT_STRING = "<br><br>{	Expected OneKey		:	";
	public static final String EXPECTED_PASS_OLK_TEXT_STRING = "<br><br>{	Expected OpenLink		:	";
	public static final String EXPECTED_FAIL_OLK_TEST_STRING = "<br><br>{	Expected OpenLink		:	";
	public static final String ACTUAL_PASS_OLK_TEST_STRING = "<br><br>{	Actual OpenLink		:	";
	public static final String ACTUAL_FAIL_OLK_TEST_STRING = "<br><br>{	Actual OpenLink		:	";

	public static final String MOBILE_FETCHED_TEXT_STRING = "<br><br>{	Mobile Fetched Value	:	";
	public static final String WEB_FETCHED_TEXT_STRING = " }</br>{	Web Fetched Value&nbsp&nbsp&nbsp&nbsp	:	";

	public static final String SCREEN_WIDTH_MACBOOK_PRO = "2880";
	public static final String SCREEN_HEIGHT_MACBOOK_PRO = "1800";

	public static final String PLACE_TYPE_HOME_BASE = "Home Base";
	public static final String TOOL_STATUS_IN_USE = "In Use";

	public static final String BARCODE_CHANGE_OVERLAY_MSG = "What would you like to do?";

	public static final String MSG_PENDING_LOCK_STATUS = "Pending Lock";

	public static final String MSG_TOOL_LOCK_STATUS = "Item locked";

	public static final String MSG_TRACK_TOOLS_TITLE_ANDROID = "Track Tools Anywhere and Prevent Theft";
	public static final String MSG_TRACK_TOOLS_TITLE = "Track Tools Anywhere & Prevent Theft";
	public static final String MSG_TRACK_TOOLS_DESCRIPTION = "Integrated Tool Tracking keeps a virtual eye on your things when you can't.";

	public static final String MSG_CENTRAL_PLACE_TITLE_ANDROID = "A Central Place For All of Your Tools";
	public static final String MSG_CENTRAL_PLACE_TITLE = "A central place for all of your tools";
	public static final String MSG_CENTRAL_PLACE_DESCRIPTION = "Keep the important information right at your fingertips.";

	public static final String MSG_TOOL_CUSTOMIZATION_TITLE = "Unlimited Tool Customization";
	public static final String MSG_TOOL_CUSTOMIZATION_DESCRIPTION = "Optimize tools for the work you do. Increase productivity with consistent performance.";

	public static final String MSG_ADD_INVENTORY_ITEM_DESCRIPTION_ANDROID = "Add an item to your inventory";
	public static final String MSG_ADD_INVENTORY_ITEM_DESCRIPTION = "Add an Item to your Inventory";
	public static final String MSG_CREATE_ACCOUNT_DESCRIPTION_ANDROID = "Join the Milwaukee Tool network";
	public static final String MSG_CREATE_ACCOUNT_DESCRIPTION = "Join the Milwaukee Tool Network";
	public static final String MSG_HELP_TRACK_TOOLS_DESCRIPTION = "Uncover lost items around you";
	public static final String MSG_CONTINUING_YOU_AGREE_TO_OUR_SUCCESS = "By continuing you agree to our";
	public static final String MSG_FORGOT_PASSWORD_DESCRIPTION = "Get help logging in to your account.";
	public static final String MSG_FORGOT_PASSWORD_DESCRIPTION_IOS = "Get help logging into your account.";
	public static final String MSG_LOGIN_ERROR_DESCRIPTION = "The Email Address field or Password field is incorrect.";
	public static final String MSG_CHECK_YOUR_EMAIL_DESCRIPTION = "We've sent you an email with a link to reset your password.";
	public static final String MSG_CHECK_YOUR_EMAIL_DESCRIPTION_2 = "We sent the email to:";
	public static final String MSG_MY_PROFILE_SCREEN_EMAIL_SENT = "Email sent to ";

	public static final String MSG_CANCEL_TRANSFER_MESSAGE = "Are you sure you want to cancel this transfer? Cancelling will empty your cart.";
	public static final String MSG_EMPTY_CART_MESSAGE = "Items will appear in your cart when you add them from the browse screen.";

	public static final String MSG_CHECK_YOUR_EMAIL_DESCRIPTION_ANDROID1 = "We've sent you an email with a link to reset your password.";
	public static final String MSG_CHECK_YOUR_EMAIL_DESCRIPTION_ANDROID2 = "We sent an email to:";
	public static final String MSG_MY_PROFILE_SCREEN_EMAIL_SENT_ANDROID = "Email sent to ";

	public static final String MSG_EMAIL_PLACEHOLDER = "You'll verify this later";
	public static final String MGS_PASSWORD_PLACEHOLDER = "Choose a strong password";

	public static final String MSG_EMAIL_PLACEHOLDER_ANDROID = "Email Address";
	public static final String MGS_PASSWORD_PLACEHOLDER_ANDROID = "Password";

	public static final String MSG_FIRST_NAME_PLACEHOLDER_ANDROID = "First Name";
	public static final String MGS_LAST_NAME_PLACEHOLDER_ANDROID = "Last Name";

	public static final String MSG_PASSWORD_UPPER_AND_LOWER_CASE = "Use upper and lower case letters (Aa)";
	public static final String MSG_PASSWORD_USE_ONE_NUMBER = "Use at least one number (0-9)";
	public static final String MSG_PASSWORD_USE_MIN_CHARACTERS = "Use at least 8 characters";

	public static final String FILTER_VERIFICATION_UID = "1KeyINVregression@mailinator.com";
	public static final String FILTER_VERIFICATION_PWD = "1Keyautomation";

	public static final String FILTER_TICK_DETAILS = "tick-007";
	public static final String FILTER_ONE_KEY_DETAILS = "2757-20";

	public static final String MODEL_NUMBER_2757 = "2757-20";

	public static final String MSG_NEW_FEATURE_LABEL_ANDROID = "NEW";
	public static final String MSG_GEOFENCE_TITLE = "Geofencing (Beta)";
	public static final String MSG_GEOFENCE_TOOLS_DESCRIPTION = "Try out our beta of geofencing, create custom fences for your jobs or home base";

	public static final String MSG_IN_OR_OUT_TITLE = "In or out?";
	public static final String MSG_IN_OR_OUT_DESCRIPTION = "View quick stats on assigned items, is everything where it should be?";

	public static final String MSG_DAILY_NOTIFICATIONS_TITLE = "Daily notifications";
	public static final String MSG_DAILY_NOTIFICATIONS_DESCRIPTION = "Set up daily summaries to let you know if your inventory is secure";

	public static final String MSG_EMAIL_NOT_SETUP = "Email is not setup on this device.";

	public static final String MSG_DEFAULT_TRANSFER_STATUS = "Transfer Complete";

	public static final String MSG_CART_EMPTY_MESSAGE = "Cart is Empty";

	public static final String MSG_BARCODE_UNSUCCESSFUL_SCAN = "Sorry, we were unable to read your barcode.You can keep trying to scan, or manually enter your barcode number.";

	// PLACES SCREEN VERIFICATION
	public static final String MSG_ADD_PLACE_SCREEN_SELECT_PLACE_TYPE = "Select Place Type";
	public static final String MSG_ADD_PLACE_SCREEN_SELECT_PLACE_TYPE_DESCRIPTION = "Which option best describes the place you want to add?";
	public static final String MSG_ADD_PLACE_SCREEN_PROJECT_LABEL = "Project/Job";
	public static final String MSG_ADD_PLACE_SCREEN_PROJECT_DESCRIPTION = "Construction or service sites";
	public static final String MSG_ADD_PLACE_SCREEN_HOMEBASE_LABEL = "Home Base";
	public static final String MSG_ADD_PLACE_SCREEN_HOMEBASE_DESCRIPTION = "Central storage locations";
	public static final String MSG_ADD_PLACE_SCREEN_VEHICLE_LABEL = "Vehicle";
	public static final String MSG_ADD_PLACE_SCREEN_VEHICLE_DESCRIPTION = "Trucks or vans";

	public static final String MSG_GET_STARTED_LABEL = "Get Started";
	public static final String MSG_GET_STRATED_PLACES_SCREEN_DESCRIPTION = "Before we can get you the details, let us know what kind of place we’re working with.";

	// WELCOME TO PLACES SCREEN
	public static final String MSG_WELCOME_TO_PLACES_LABEL = "Welcome to Places";
	public static final String MSG_WELCOME_TO_PLACES_SCREEN_DESCRIPTION = "Get your inventory organized based on how you organize your business.";

	// WELCOME TO PLACES SCREEN - FRESH INSTALLATION
	public static final String MSG_WELCOME_TO_PLACES_SCREEN_DESCRIPTION_FRESH_INSTALL = "Categorize your Places based on how you organize your business.";
	public static final String MSG_WELCOME_TO_PLACES_SCREEN_ADD_PLACE_TO_GET_STARTED_FRESH_INSTALL = "Add a Place to get started by pressing the +";

	// ADD PLACE SCREEN
	public static final String MSG_ADD_PLACE_DETAILS_SCREEN_PLACE_NAME_PLACEHOLDER = "Enter place name";
	public static final String MSG_ADD_PLACE_DETAILS_SCREEN_JOB_NUMBER_PLACEHOLDER = "Enter job number";
	public static final String MSG_ADD_PLACE_DETAILS_SCREEN_COST_CODE_PLACEHOLDER = "Enter cost code";
	public static final String MSG_ADD_PLACE_DETAILS_SCREEN_VEHICLE_NUMBER_PLACEHOLDER = "Enter vehicle number";

	// ASSIGNED PEOPLE SCREEN
	public static final String MSG_VERIFY_NO_PEOPLE_TO_DISPLAY_MSG = "No People to Display";
	public static final String MSG_VERIFY_NO_PEOPLE_TO_DISPLAY_DESCRIPTION_MSG = "You do not have any people for us to display.";

	// ADD PERSON SCREEN
	public static final String MSG_PERSON_NAME_TEXT_FIELD_PLACEHOLDER = "Person Name";

	public static final String MSG_DELETE_PLACE_CONFIRMATION = "Are you sure you want to delete this place?";

	// ASSIGNED ITEMS SCREEN
	public static final String MSG_NO_INVENTORY_ADDED = "No Inventory Added";
	public static final String MSG_NO_INVENTORY_ADDED_DESCRIPTION = "Add tools or equipment to get started";

	public static final String MSG_NOTHING_TO_REPORT_HERE = "Nothing to report here! You are all good.";
}