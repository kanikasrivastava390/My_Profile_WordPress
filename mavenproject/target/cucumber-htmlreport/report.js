$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("My_Profile.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "\r\n/*This scenario is a background scenario that will run before all other scenarios*/",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 19301273900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1692930300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify title of the page",
  "description": "",
  "id": "application-login;verify-title-of-the-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verify the heading of My Profile page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify that My profile is selected by default in the side bar",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify the name of my profile section",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify the input boxes and assosciated labels in my profile section",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 5406825700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_title_of_the_page()"
});
formatter.result({
  "duration": 33669700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_heading_of_my_profile_page()"
});
formatter.result({
  "duration": 92307800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_that_my_profile_is_selected_by_default_in_the_side_bar()"
});
formatter.result({
  "duration": 157823600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_name_of_my_profile_section()"
});
formatter.result({
  "duration": 48389700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_input_boxes_in_my_profile_section()"
});
formatter.result({
  "duration": 741113800,
  "status": "passed"
});
formatter.after({
  "duration": 1037261000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 13191874600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1974565400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "Verify that Public display name is autopopulated with username in my profile section.",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Verify that Public display name is autopopulated with username in my profile section",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 6739120400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_that_public_display_name_is_autopopulated_with_username_in_my_profile_section()"
});
formatter.result({
  "duration": 193046500,
  "status": "passed"
});
formatter.after({
  "duration": 3015035700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 16978366900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 2619830700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify Hide my Gravatar profile checkbox and message.",
  "description": "",
  "id": "application-login;verify-hide-my-gravatar-profile-checkbox-and-message.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Verify Hide my Gravatar profile checkbox and message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 9794112900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_hide_my_gravatar_profile_checkbox_and_message()"
});
formatter.result({
  "duration": 182741300,
  "status": "passed"
});
formatter.after({
  "duration": 1560973100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 13544064700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1628914100,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "",
  "description": "Verify that save button is disabled when no information is updated in input boxes.",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Verify that save button is disabled when no information is updated in input boxes",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 6114479900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_that_save_button_is_disabled_when_no_information_is_updated_in_input_boxes()"
});
formatter.result({
  "duration": 51886500,
  "status": "passed"
});
formatter.after({
  "duration": 1201316800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 17204698200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1517093300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "",
  "description": "Verify that save button is enabled when information is updated in input \r\nboxes and functionality is working fine.",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Verify that save button is enabled when information is updated in input boxes",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "On clicking save button is disabled again and updated values are stored in input boxes",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 8120517800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_that_save_button_is_enabled_when_information_is_updated_in_input_boxes()"
});
formatter.result({
  "duration": 12105050900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.on_clicking_save_buton_is_disabled_again_and_updated_values_are_stored_in_input_boxes()"
});
formatter.result({
  "duration": 6903290600,
  "status": "passed"
});
formatter.after({
  "duration": 2771408200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 17582281800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 2063490500,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify that there is a section with heading Profile Links.",
  "description": "",
  "id": "application-login;verify-that-there-is-a-section-with-heading-profile-links.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Verify that there is a section with heading Profile Links",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 9748999100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_that_there_is_a_section_with_heading_profile_links()"
});
formatter.result({
  "duration": 378086700,
  "status": "passed"
});
formatter.after({
  "duration": 1709335600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 14774976300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1928153800,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Verify that Add link is present in heading Profile Links.",
  "description": "",
  "id": "application-login;verify-that-add-link-is-present-in-heading-profile-links.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Verify that Add link is present in heading Profile Links",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 5394092900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_that_add_link_is_present_in_heading_profile_links()"
});
formatter.result({
  "duration": 208771500,
  "status": "passed"
});
formatter.after({
  "duration": 1636159500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 14285246100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1801905500,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "",
  "description": "Verify the message displayed in section Profile Links irrespective of links present or not",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Verify the common message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 11331230600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_common_message_displayed()"
});
formatter.result({
  "duration": 63665200,
  "status": "passed"
});
formatter.after({
  "duration": 2051369200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 20654829200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1535726400,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "",
  "description": "Verify the message displayed in section Profile Links when links are  not present.",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Verify the message displayed in section Profile Links when links are not present",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 4099484400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_message_displayed_in_heading_profile_links_when_no_links_are_present()"
});
formatter.result({
  "duration": 74524100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027Profile links\u0027]/parent::div/parent::div/following-sibling::div/div/p[2]\"}\n  (Session info: chrome\u003d98.0.4758.102)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027DESKTOP-PTS94DD\u0027, ip: \u0027192.168.1.15\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_112\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [9be3ca344c788624cba1db5abb896454, findElement {using\u003dxpath, value\u003d//span[text()\u003d\u0027Profile links\u0027]/parent::div/parent::div/following-sibling::div/div/p[2]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.102, chrome: {chromedriverVersion: 98.0.4758.48 (d869ab3eda606..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50420}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50420/devtoo..., se:cdpVersion: 98.0.4758.102, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9be3ca344c788624cba1db5abb896454\r\n\tat sun.reflect.GeneratedConstructorAccessor16.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\r\n\tat stepDefinition.stepDefination.verify_the_message_displayed_in_heading_profile_links_when_no_links_are_present(stepDefination.java:286)\r\n\tat ✽.Then Verify the message displayed in section Profile Links when links are not present(My_Profile.feature:53)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2036010600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 17730419100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 8665629900,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Verify that urls are added in profile section if user wants to add.",
  "description": "",
  "id": "application-login;verify-that-urls-are-added-in-profile-section-if-user-wants-to-add.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Verify that links are added in profile section if user wants to add",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 5846026400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_message_displayed_in_heading_profile_links_when_links_are_present()"
});
formatter.result({
  "duration": 9956037800,
  "status": "passed"
});
formatter.after({
  "duration": 3324673900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 17273118100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1746561800,
  "status": "passed"
});
formatter.scenario({
  "line": 59,
  "name": "",
  "description": "Verify that we can view the option to add wordpress site on clicking add.",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 61,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Verify that we can view the option to add wordpress site on clicking add",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 4135426400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.Verify_that_we_can_view_the_option_to_add_wordpress()"
});
formatter.result({
  "duration": 648024800,
  "status": "passed"
});
formatter.after({
  "duration": 1073802600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 12685087500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 2245650500,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "",
  "description": "Verify the message and buttons that will be displayed when we click on add wordpress site and there is no already created WordPress site",
  "id": "application-login;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "Verify the message and buttons that will be displayed when we click on add wordpress site",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "Verify the functionality of Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Verify the functionality of Create button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 4156209400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_message_and_buttons_that_will_be_displayed_when_we_click_on_add_wordpress_site()"
});
formatter.result({
  "duration": 1436251100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_functionality_of_cancel_button()"
});
formatter.result({
  "duration": 1910137800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_functionality_of_create_button()"
});
formatter.result({
  "duration": 6055105700,
  "status": "passed"
});
formatter.after({
  "duration": 1364905800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 11532959300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1600520400,
  "status": "passed"
});
formatter.scenario({
  "line": 71,
  "name": "Verify the help icon.",
  "description": "",
  "id": "application-login;verify-the-help-icon.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 72,
  "name": "homepage is navigated",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "Verify the help icon",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 4229769300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_the_help_icon()"
});
formatter.result({
  "duration": 8809621600,
  "status": "passed"
});
formatter.after({
  "duration": 2796670700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Home Page Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user log in into application with username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_is_on_landing_page()"
});
formatter.result({
  "duration": 12004329900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_log_in_into_application_with_username_and_password()"
});
formatter.result({
  "duration": 1659796900,
  "status": "passed"
});
formatter.scenario({
  "line": 75,
  "name": "Verify click to change photo icon and assosciated messages",
  "description": "",
  "id": "application-login;verify-click-to-change-photo-icon-and-assosciated-messages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 76,
  "name": "homepage is navigated",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "Verify click to change photo icon and assosciated messages",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.homepage_is_populated()"
});
formatter.result({
  "duration": 8071090300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.verify_click_to_change_photo_icon_and_assosciated_messages()"
});
formatter.result({
  "duration": 771373200,
  "status": "passed"
});
formatter.after({
  "duration": 1806981400,
  "status": "passed"
});
});