import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息
 * 通过小程序抓包购物车接口获取headers和body中的数据填入
 */
public class UserConfig {

    //站点id
    public static final String addressId = "";

    /**
     * 提前获取收货地址id 填写到addressId上 规则为该站点可送达的默认收货地址  如果没有请自行去APP中设置好再运行
     */
    public static void main(String[] args) {
        String addressId = Api.getAddressId();
        System.out.println("addressId：" + addressId);
    }


    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("ddmc-city-number", "");
        headers.put("ddmc-build-version", "");
        headers.put("ddmc-device-id", "");
        headers.put("ddmc-station-id", "");
        headers.put("ddmc-channel", "applet");
        headers.put("ddmc-os-version", "[object Undefined]");
        headers.put("ddmc-app-client-id", "4");
        headers.put("cookie", "");
        headers.put("ddmc-ip", "");
        headers.put("ddmc-longitude", "");
        headers.put("ddmc-latitude", "");
        headers.put("ddmc-api-version", "");
        headers.put("ddmc-uid", "");
        headers.put("user-agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 15_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148 MicroMessenger/8.0.18(0x1800123c) NetType/WIFI Language/zh_CN");
        headers.put("referer", "https://servicewechat.com/wx1e113254eda17715/422/page-frame.html");
        return headers;
    }

    public static Map getBody() {
        Map body = new HashMap<>();
        body.put("uid", "");
        body.put("longitude", "");
        body.put("latitude", "");
        body.put("station_id", "");
        body.put("city_number", "");
        body.put("api_version", "");
        body.put("app_version", "");
        body.put("applet_source", "");
        body.put("channel", "applet");
        body.put("app_client_id", "4");
        body.put("sharer_uid", "");
        body.put("openid", "");
        body.put("h5_source", "");
        body.put("device_token", "");
        return body;
    }

}