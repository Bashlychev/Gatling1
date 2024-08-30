package Simulations.asafov;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.HashMap;
import java.util.Map;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class ASAF01 extends Simulation {
{

int users_flood_AS03 = Integer.getInteger("users_flood_AS03", 1);
int users_flood_AS04 = Integer.getInteger("users_flood_AS04", 1);
int users_flood_AS05 = Integer.getInteger("users_flood_AS05", 1);
int users_flood_AS06 = Integer.getInteger("users_flood_AS06", 1);
int users_flood_AS07 = Integer.getInteger("users_flood_AS07", 1);
int users_flood_AS08 = Integer.getInteger("users_flood_AS08", 1);
int users_flood_AS09 = Integer.getInteger("users_flood_AS09", 1);
int users_flood_AS10 = Integer.getInteger("users_flood_AS10", 1);


// Scenarious

        HttpProtocolBuilder httpProtocol_News1 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS03_0 = new HashMap<>();
        headersAS03_0.put("accept", "*/*");
        headersAS03_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS03_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS03_0.put("content-type", "text/plain");
        headersAS03_0.put("origin", "https://asafov.ru");
        headersAS03_0.put("priority", "u=1, i");
        headersAS03_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS03_0.put("sec-ch-ua-mobile", "?0");
        headersAS03_0.put("sec-ch-ua-platform", "Linux");
        headersAS03_0.put("sec-fetch-dest", "empty");
        headersAS03_0.put("sec-fetch-mode", "cors");
        headersAS03_0.put("sec-fetch-site", "cross-site");
        headersAS03_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS03_1 = new HashMap<>();
        headersAS03_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS03_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS03_1.put("sec-ch-ua-mobile", "?0");
        headersAS03_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS03_4 = new HashMap<>();
        headersAS03_4.put("Origin", "https://asafov.ru");
        headersAS03_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS03_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS03_4.put("sec-ch-ua-mobile", "?0");
        headersAS03_4.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS03_24 = new HashMap<>();
        headersAS03_24.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS03_24.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS03_24.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS03_24.put("priority", "u=0, i");
        headersAS03_24.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS03_24.put("sec-ch-ua-mobile", "?0");
        headersAS03_24.put("sec-ch-ua-platform", "Linux");
        headersAS03_24.put("sec-fetch-dest", "document");
        headersAS03_24.put("sec-fetch-mode", "navigate");
        headersAS03_24.put("sec-fetch-site", "same-origin");
        headersAS03_24.put("sec-fetch-user", "?1");
        headersAS03_24.put("upgrade-insecure-requests", "1");
        headersAS03_24.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS03_36 = new HashMap<>();
        headersAS03_36.put("accept", "*/*");
        headersAS03_36.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS03_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS03_36.put("origin", "https://asafov.ru");
        headersAS03_36.put("priority", "u=1, i");
        headersAS03_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS03_36.put("sec-ch-ua-mobile", "?0");
        headersAS03_36.put("sec-ch-ua-platform", "Linux");
        headersAS03_36.put("sec-fetch-dest", "empty");
        headersAS03_36.put("sec-fetch-mode", "cors");
        headersAS03_36.put("sec-fetch-site", "cross-site");
        headersAS03_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS03_37 = new HashMap<>();
        headersAS03_37.put("Upgrade-Insecure-Requests", "1");
        headersAS03_37.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS03_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS03_37.put("sec-ch-ua-mobile", "?0");
        headersAS03_37.put("sec-ch-ua-platform", "Linux");

        String uri2 = "https://asafov.ru";

        ScenarioBuilder scnAS03 = scenario("Projects.asafov.Pile.News1")
                .exec(
                        http("request_0")
                                .post("/webvisor/64870417?wv-part=4&wv-type=7&wmode=0&wv-hit=125569288&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Fv-zabajkalskom-krae-startovalo-dosrochnoe-golosovanie&rn=1047143549&browser-info=we%3A1%3Aet%3A1724685860%3Aw%3A1905x927%3Av%3A1420%3Az%3A300%3Ai%3A20240826202419%3Au%3A1724676906572442126%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724685860&t=gdpr(14)ti(1)")
                                .headers(headersAS03_0)
//                                .body(RawFileBody("news1/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .get(uri2 + "/build/assets/app-C22gTps0.css")
                                                .headers(headersAS03_1),
                                        http("request_2")
                                                .get(uri2 + "/build/assets/element-BvquaXif.css")
                                                .headers(headersAS03_1),
                                        http("request_3")
                                                .get(uri2 + "/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS03_1),
                                        http("request_4")
                                                .get(uri2 + "/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS03_4),
                                        http("request_5")
                                                .get(uri2 + "/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS03_4),
                                        http("request_6")
                                                .get(uri2 + "/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS03_4),
                                        http("request_7")
                                                .get(uri2 + "/assets/css/cookies.css")
                                                .headers(headersAS03_1),
                                        http("request_8")
                                                .get(uri2 + "/assets/header/images/btn-burger.svg")
                                                .headers(headersAS03_1),
                                        http("request_9")
                                                .get(uri2 + "/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS03_1),
                                        http("request_10")
                                                .get(uri2 + "/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS03_1),
                                        http("request_11")
                                                .get(uri2 + "/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS03_1),
                                        http("request_12")
                                                .get(uri2 + "/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS03_1),
                                        http("request_13")
                                                .get(uri2 + "/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS03_1),
                                        http("request_14")
                                                .get(uri2 + "/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS03_1),
                                        http("request_15")
                                                .get(uri2 + "/assets/header/images/icons/quote.svg")
                                                .headers(headersAS03_1),
                                        http("request_16")
                                                .get(uri2 + "/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS03_1),
                                        http("request_17")
                                                .get(uri2 + "/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS03_1),
                                        http("request_18")
                                                .get(uri2 + "/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS03_1),
                                        http("request_19")
                                                .get(uri2 + "/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS03_1),
                                        http("request_20")
                                                .get(uri2 + "/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS03_1),
                                        http("request_21")
                                                .get(uri2 + "/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS03_1),
                                        http("request_22")
                                                .get(uri2 + "/static/banners/zen-button.png")
                                                .headers(headersAS03_1),
                                        http("request_23")
                                                .get(uri2 + "/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS03_1),
                                        http("request_24")
                                                .get(uri2 + "/news/v-zabajkalskom-krae-startovalo-dosrochnoe-golosovanie")
                                                .headers(headersAS03_24),
                                        http("request_25")
                                                .get(uri2 + "/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_26")
                                                .get(uri2 + "/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_27")
                                                .get(uri2 + "/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_28")
                                                .get(uri2 + "/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_29")
                                                .get(uri2 + "/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_30")
                                                .get(uri2 + "/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
//                                        http("request_31")
//                                                .get("/metrika/tag.js")
//                                                .headers(headersAS03_1),
                                        http("request_32")
                                                .get(uri2 + "/assets/js/front/cookies.js")
                                                .headers(headersAS03_4),
                                        http("request_33")
                                                .get(uri2 + "/assets/js/front/header.js")
                                                .headers(headersAS03_4),
                                        http("request_34")
                                                .get(uri2 + "/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_35")
                                                .get(uri2 + "/static/favicon.ico")
                                                .headers(headersAS03_1),
                                        http("request_36")
                                                .get("/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Fv-zabajkalskom-krae-startovalo-dosrochnoe-golosovanie&page-ref=https%3A%2F%2Fasafov.ru%2Fnews&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A430672215%3Az%3A300%3Ai%3A20240826202420%3Aet%3A1724685861%3Ac%3A1%3Arn%3A254062203%3Arqn%3A33%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C133%2C70%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724685860233%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724685861%3At%3A%D0%92%20%D0%97%D0%B0%D0%B1%D0%B0%D0%B9%D0%BA%D0%B0%D0%BB%D1%8C%D1%81%D0%BA%D0%BE%D0%BC%20%D0%BA%D1%80%D0%B0%D0%B5%20%D1%81%D1%82%D0%B0%D1%80%D1%82%D0%BE%D0%B2%D0%B0%D0%BB%D0%BE%20%D0%B4%D0%BE%D1%81%D1%80%D0%BE%D1%87%D0%BD%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS03_36)
//                                        http("request_37")
//                                                .get("/metrika/metrika_match.html")
//                                                .headers(headersAS03_37)
                                )
                );

        HttpProtocolBuilder httpProtocol_News2 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS04_0 = new HashMap<>();
        headersAS04_0.put("accept", "*/*");
        headersAS04_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS04_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS04_0.put("content-type", "text/plain");
        headersAS04_0.put("origin", "https://asafov.ru");
        headersAS04_0.put("priority", "u=1, i");
        headersAS04_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS04_0.put("sec-ch-ua-mobile", "?0");
        headersAS04_0.put("sec-ch-ua-platform", "Linux");
        headersAS04_0.put("sec-fetch-dest", "empty");
        headersAS04_0.put("sec-fetch-mode", "cors");
        headersAS04_0.put("sec-fetch-site", "cross-site");
        headersAS04_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS04_2 = new HashMap<>();
        headersAS04_2.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS04_2.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS04_2.put("sec-ch-ua-mobile", "?0");
        headersAS04_2.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS04_5 = new HashMap<>();
        headersAS04_5.put("Origin", "https://asafov.ru");
        headersAS04_5.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS04_5.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS04_5.put("sec-ch-ua-mobile", "?0");
        headersAS04_5.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS04_25 = new HashMap<>();
        headersAS04_25.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS04_25.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS04_25.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS04_25.put("priority", "u=0, i");
        headersAS04_25.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS04_25.put("sec-ch-ua-mobile", "?0");
        headersAS04_25.put("sec-ch-ua-platform", "Linux");
        headersAS04_25.put("sec-fetch-dest", "document");
        headersAS04_25.put("sec-fetch-mode", "navigate");
        headersAS04_25.put("sec-fetch-site", "same-origin");
        headersAS04_25.put("sec-fetch-user", "?1");
        headersAS04_25.put("upgrade-insecure-requests", "1");
        headersAS04_25.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS04_37 = new HashMap<>();
        headersAS04_37.put("accept", "*/*");
        headersAS04_37.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS04_37.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS04_37.put("origin", "https://asafov.ru");
        headersAS04_37.put("priority", "u=1, i");
        headersAS04_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS04_37.put("sec-ch-ua-mobile", "?0");
        headersAS04_37.put("sec-ch-ua-platform", "Linux");
        headersAS04_37.put("sec-fetch-dest", "empty");
        headersAS04_37.put("sec-fetch-mode", "cors");
        headersAS04_37.put("sec-fetch-site", "cross-site");
        headersAS04_37.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS04_38 = new HashMap<>();
        headersAS04_38.put("Upgrade-Insecure-Requests", "1");
        headersAS04_38.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS04_38.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS04_38.put("sec-ch-ua-mobile", "?0");
        headersAS04_38.put("sec-ch-ua-platform", "Linux");

        String uri2asaf = "https://asafov.ru";

        ScenarioBuilder scnAS04 = scenario("Projects.asafov.Pile.News2")
                .exec(
                        http("request_0")
                                .post("/webvisor/64870417?wv-part=2&wv-type=7&wmode=0&wv-hit=591456969&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Fbolee-20-regionov-rossii-podali-zayavki-na-uchastie-v-deg-v-edg-2023&rn=750970568&browser-info=bt%3A1%3Awe%3A1%3Aet%3A1724685940%3Aw%3A1905x927%3Av%3A1420%3Az%3A300%3Ai%3A20240826202540%3Au%3A1724676906572442126%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724685940&t=gdpr(14)ti(1)")
                                .headers(headersAS04_0)
//                                .body(RawFileBody("news2/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .post("/webvisor/64870417?wv-part=2&wv-type=7&wmode=0&wv-hit=591456969&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Fbolee-20-regionov-rossii-podali-zayavki-na-uchastie-v-deg-v-edg-2023&rn=12776793&browser-info=we%3A1%3Aet%3A1724685941%3Aw%3A1905x927%3Av%3A1420%3Az%3A300%3Ai%3A20240826202540%3Au%3A1724676906572442126%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724685941&t=gdpr(14)ti(1)")
                                                .headers(headersAS04_0),
//                                                .body(RawFileBody("news2/0001_request.gif")),
                                        http("request_2")
                                                .get(uri2asaf + "/build/assets/app-C22gTps0.css")
                                                .headers(headersAS04_2),
                                        http("request_3")
                                                .get(uri2asaf + "/build/assets/element-BvquaXif.css")
                                                .headers(headersAS04_2),
                                        http("request_4")
                                                .get(uri2asaf + "/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS04_2),
                                        http("request_5")
                                                .get(uri2asaf + "/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS04_5),
                                        http("request_6")
                                                .get(uri2asaf + "/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS04_5),
                                        http("request_7")
                                                .get(uri2asaf + "/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS04_5),
                                        http("request_8")
                                                .get(uri2asaf + "/assets/css/cookies.css")
                                                .headers(headersAS04_2),
                                        http("request_9")
                                                .get(uri2asaf + "/assets/header/images/btn-burger.svg")
                                                .headers(headersAS04_2),
                                        http("request_10")
                                                .get(uri2asaf + "/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS04_2),
                                        http("request_11")
                                                .get(uri2asaf + "/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS04_2),
                                        http("request_12")
                                                .get(uri2asaf + "/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS04_2),
                                        http("request_13")
                                                .get(uri2asaf + "/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS04_2),
                                        http("request_14")
                                                .get(uri2asaf + "/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS04_2),
                                        http("request_15")
                                                .get(uri2asaf + "/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS04_2),
                                        http("request_16")
                                                .get(uri2asaf + "/assets/header/images/icons/quote.svg")
                                                .headers(headersAS04_2),
                                        http("request_17")
                                                .get(uri2asaf + "/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS04_2),
                                        http("request_18")
                                                .get(uri2asaf + "/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS04_2),
                                        http("request_19")
                                                .get(uri2asaf + "/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS04_2),
                                        http("request_20")
                                                .get(uri2asaf + "/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS04_2),
                                        http("request_21")
                                                .get(uri2asaf + "/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS04_2),
                                        http("request_22")
                                                .get(uri2asaf + "/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS04_2),
                                        http("request_23")
                                                .get(uri2asaf + "/static/banners/zen-button.png")
                                                .headers(headersAS04_2),
                                        http("request_24")
                                                .get(uri2asaf + "/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS04_2),
                                        http("request_25")
                                                .get(uri2asaf + "/news/bolee-20-regionov-rossii-podali-zayavki-na-uchastie-v-deg-v-edg-2023")
                                                .headers(headersAS04_25),
                                        http("request_26")
                                                .get(uri2asaf + "/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_27")
                                                .get(uri2asaf + "/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_28")
                                                .get(uri2asaf + "/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_29")
                                                .get(uri2asaf + "/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_30")
                                                .get(uri2asaf + "/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_31")
                                                .get(uri2asaf + "/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
//                                        http("request_32")
//                                                .get("/metrika/tag.js")
//                                                .headers(headersAS04_2),
                                        http("request_33")
                                                .get(uri2asaf + "/assets/js/front/cookies.js")
                                                .headers(headersAS04_5),
                                        http("request_34")
                                                .get(uri2asaf + "/assets/js/front/header.js")
                                                .headers(headersAS04_5),
                                        http("request_35")
                                                .get(uri2asaf + "/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_36")
                                                .get(uri2asaf + "/static/favicon.ico")
                                                .headers(headersAS04_2),
                                        http("request_37")
                                                .get("/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Fbolee-20-regionov-rossii-podali-zayavki-na-uchastie-v-deg-v-edg-2023&page-ref=https%3A%2F%2Fasafov.ru%2Fnews%3Fpage%3D44&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A949966782%3Az%3A300%3Ai%3A20240826202542%3Aet%3A1724685942%3Ac%3A1%3Arn%3A603585971%3Arqn%3A40%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C144%2C59%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724685941961%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724685942%3At%3A%D0%91%D0%BE%D0%BB%D0%B5%D0%B5%2020%C2%A0%D1%80%D0%B5%D0%B3%D0%B8%D0%BE%D0%BD%D0%BE%D0%B2%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%20%D0%BF%D0%BE%D0%B4%D0%B0%D0%BB%D0%B8%20%D0%B7%D0%B0%D1%8F%D0%B2%D0%BA%D0%B8%20%D0%BD%D0%B0%C2%A0%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%B8%D0%B5%20%D0%B2%C2%A0%D0%94%D0%AD%D0%93%20%D0%B2%C2%A0%D0%95%D0%94%D0%93-2023%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS04_37)
//                                        http("request_38")
//                                                .get("/metrika/metrika_match.html")
//                                                .headers(headersAS04_38)
                                )
                );

        HttpProtocolBuilder httpProtocol_News3 = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS05_0 = new HashMap<>();
        headersAS05_0.put("accept", "*/*");
        headersAS05_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS05_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS05_0.put("content-type", "text/plain");
        headersAS05_0.put("origin", "https://asafov.ru");
        headersAS05_0.put("priority", "u=1, i");
        headersAS05_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS05_0.put("sec-ch-ua-mobile", "?0");
        headersAS05_0.put("sec-ch-ua-platform", "Linux");
        headersAS05_0.put("sec-fetch-dest", "empty");
        headersAS05_0.put("sec-fetch-mode", "cors");
        headersAS05_0.put("sec-fetch-site", "cross-site");
        headersAS05_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS05_1 = new HashMap<>();
        headersAS05_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS05_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS05_1.put("sec-ch-ua-mobile", "?0");
        headersAS05_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS05_4 = new HashMap<>();
        headersAS05_4.put("Origin", "https://asafov.ru");
        headersAS05_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS05_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS05_4.put("sec-ch-ua-mobile", "?0");
        headersAS05_4.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS05_24 = new HashMap<>();
        headersAS05_24.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS05_24.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS05_24.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS05_24.put("priority", "u=0, i");
        headersAS05_24.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS05_24.put("sec-ch-ua-mobile", "?0");
        headersAS05_24.put("sec-ch-ua-platform", "Linux");
        headersAS05_24.put("sec-fetch-dest", "document");
        headersAS05_24.put("sec-fetch-mode", "navigate");
        headersAS05_24.put("sec-fetch-site", "same-origin");
        headersAS05_24.put("sec-fetch-user", "?1");
        headersAS05_24.put("upgrade-insecure-requests", "1");
        headersAS05_24.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS05_36 = new HashMap<>();
        headersAS05_36.put("accept", "*/*");
        headersAS05_36.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS05_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS05_36.put("origin", "https://asafov.ru");
        headersAS05_36.put("priority", "u=1, i");
        headersAS05_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS05_36.put("sec-ch-ua-mobile", "?0");
        headersAS05_36.put("sec-ch-ua-platform", "Linux");
        headersAS05_36.put("sec-fetch-dest", "empty");
        headersAS05_36.put("sec-fetch-mode", "cors");
        headersAS05_36.put("sec-fetch-site", "cross-site");
        headersAS05_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS05_37 = new HashMap<>();
        headersAS05_37.put("Upgrade-Insecure-Requests", "1");
        headersAS05_37.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS05_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS05_37.put("sec-ch-ua-mobile", "?0");
        headersAS05_37.put("sec-ch-ua-platform", "Linux");

        String uri2as = "https://asafov.ru";

        ScenarioBuilder scnAS05 = scenario("Projects.asafov.Pile.News3")
                .exec(
                        http("request_0")
                                .post("/webvisor/64870417?wv-part=2&wv-type=7&wmode=0&wv-hit=516033656&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Faleksandr-asafov-nablyudaetsya-kaskad-otkazov-so-storony-dazhe-novoj-parlamentskoj-oppoziczii&rn=1058746416&browser-info=we%3A1%3Aet%3A1724685971%3Aw%3A1905x927%3Av%3A1420%3Az%3A300%3Ai%3A20240826202611%3Au%3A1724676906572442126%3Avf%3Acstsejpczyib8nf716ce02r1en%3Ast%3A1724685971&t=gdpr(14)ti(1)")
                                .headers(headersAS05_0)
//                                .body(RawFileBody("news3/0000_request.gif"))
                                .resources(
                                        http("request_1")
                                                .get(uri2as + "/build/assets/app-C22gTps0.css")
                                                .headers(headersAS05_1),
                                        http("request_2")
                                                .get(uri2as + "/build/assets/element-BvquaXif.css")
                                                .headers(headersAS05_1),
                                        http("request_3")
                                                .get(uri2as + "/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS05_1),
                                        http("request_4")
                                                .get(uri2as + "/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS05_4),
                                        http("request_5")
                                                .get(uri2as + "/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS05_4),
                                        http("request_6")
                                                .get(uri2as + "/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS05_4),
                                        http("request_7")
                                                .get(uri2as + "/assets/css/cookies.css")
                                                .headers(headersAS05_1),
                                        http("request_8")
                                                .get(uri2as + "/assets/header/images/btn-burger.svg")
                                                .headers(headersAS05_1),
                                        http("request_9")
                                                .get(uri2as + "/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS05_1),
                                        http("request_10")
                                                .get(uri2as + "/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS05_1),
                                        http("request_11")
                                                .get(uri2as + "/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS05_1),
                                        http("request_12")
                                                .get(uri2as + "/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS05_1),
                                        http("request_13")
                                                .get(uri2as + "/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS05_1),
                                        http("request_14")
                                                .get(uri2as + "/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS05_1),
                                        http("request_15")
                                                .get(uri2as + "/assets/header/images/icons/quote.svg")
                                                .headers(headersAS05_1),
                                        http("request_16")
                                                .get(uri2as + "/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS05_1),
                                        http("request_17")
                                                .get(uri2as + "/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS05_1),
                                        http("request_18")
                                                .get(uri2as + "/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS05_1),
                                        http("request_19")
                                                .get(uri2as + "/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS05_1),
                                        http("request_20")
                                                .get(uri2as + "/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS05_1),
                                        http("request_21")
                                                .get(uri2as + "/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS05_1),
                                        http("request_22")
                                                .get(uri2as + "/static/banners/zen-button.png")
                                                .headers(headersAS05_1),
                                        http("request_23")
                                                .get(uri2as + "/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS05_1),
                                        http("request_24")
                                                .get(uri2as + "/news/aleksandr-asafov-nablyudaetsya-kaskad-otkazov-so-storony-dazhe-novoj-parlamentskoj-oppoziczii")
                                                .headers(headersAS05_24),
                                        http("request_25")
                                                .get(uri2as + "/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_26")
                                                .get(uri2as + "/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_27")
                                                .get(uri2as + "/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_28")
                                                .get(uri2as + "/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_29")
                                                .get(uri2as + "/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_30")
                                                .get(uri2as + "/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
//                                        http("request_31")
//                                                .get("/metrika/tag.js")
//                                                .headers(headersAS05_1),
                                        http("request_32")
                                                .get(uri2as + "/assets/js/front/cookies.js")
                                                .headers(headersAS05_4),
                                        http("request_33")
                                                .get(uri2as + "/assets/js/front/header.js")
                                                .headers(headersAS05_4),
                                        http("request_34")
                                                .get(uri2as + "/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_35")
                                                .get(uri2as + "/static/favicon.ico")
                                                .headers(headersAS05_1),
                                        http("request_36")
                                                .get("/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fnews%2Faleksandr-asafov-nablyudaetsya-kaskad-otkazov-so-storony-dazhe-novoj-parlamentskoj-oppoziczii&page-ref=https%3A%2F%2Fasafov.ru%2Fnews%3Fpage%3D38&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A537646066%3Az%3A300%3Ai%3A20240826202611%3Aet%3A1724685972%3Ac%3A1%3Arn%3A590168616%3Arqn%3A45%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C139%2C58%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724685971178%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724685972%3At%3A%D0%90%D0%BB%D0%B5%D0%BA%D1%81%D0%B0%D0%BD%D0%B4%D1%80%20%D0%90%D1%81%D0%B0%D1%84%D0%BE%D0%B2%3A%20%C2%AB%D0%9D%D0%B0%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0%D0%B5%D1%82%D1%81%D1%8F%20%C2%AB%D0%BA%D0%B0%D1%81%D0%BA%D0%B0%D0%B4%20%D0%BE%D1%82%D0%BA%D0%B0%D0%B7%D0%BE%D0%B2%C2%BB%20%D1%81%D0%BE%20%D1%81%D1%82%D0%BE%D1%80%D0%BE%D0%BD%D1%8B%20%D0%B4%D0%B0%D0%B6%D0%B5%20%D0%BD%D0%BE%D0%B2%D0%BE%D0%B9%20%D0%BF%D0%B0%D1%80%D0%BB%D0%B0%D0%BC%D0%B5%D0%BD%D1%82%D1%81%D0%BA%D0%BE%D0%B9%20%D0%BE%D0%BF%D0%BF%D0%BE%D0%B7%D0%B8%D1%86%D0%B8%D0%B8%C2%BB%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS05_36)
//                                        http("request_37")
//                                                .get("/metrika/metrika_match.html")
//                                                .headers(headersAS05_37)
                                )
                );

        HttpProtocolBuilder httpProtocol_NewsAuth1 = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS06_0 = new HashMap<>();
        headersAS06_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS06_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS06_0.put("sec-ch-ua-mobile", "?0");
        headersAS06_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS06_3 = new HashMap<>();
        headersAS06_3.put("Origin", "https://asafov.ru");
        headersAS06_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS06_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS06_3.put("sec-ch-ua-mobile", "?0");
        headersAS06_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS06_23 = new HashMap<>();
        headersAS06_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS06_23.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS06_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS06_23.put("priority", "u=0, i");
        headersAS06_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS06_23.put("sec-ch-ua-mobile", "?0");
        headersAS06_23.put("sec-ch-ua-platform", "Linux");
        headersAS06_23.put("sec-fetch-dest", "document");
        headersAS06_23.put("sec-fetch-mode", "navigate");
        headersAS06_23.put("sec-fetch-site", "same-origin");
        headersAS06_23.put("sec-fetch-user", "?1");
        headersAS06_23.put("upgrade-insecure-requests", "1");
        headersAS06_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS06_35 = new HashMap<>();
        headersAS06_35.put("accept", "*/*");
        headersAS06_35.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS06_35.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS06_35.put("origin", "https://asafov.ru");
        headersAS06_35.put("priority", "u=1, i");
        headersAS06_35.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS06_35.put("sec-ch-ua-mobile", "?0");
        headersAS06_35.put("sec-ch-ua-platform", "Linux");
        headersAS06_35.put("sec-fetch-dest", "empty");
        headersAS06_35.put("sec-fetch-mode", "cors");
        headersAS06_35.put("sec-fetch-site", "cross-site");
        headersAS06_35.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS06_36 = new HashMap<>();
        headersAS06_36.put("Upgrade-Insecure-Requests", "1");
        headersAS06_36.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS06_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS06_36.put("sec-ch-ua-mobile", "?0");
        headersAS06_36.put("sec-ch-ua-platform", "Linux");

        String uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnAS06 = scenario("Projects.asafov.NewsAuth1")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS06_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS06_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS06_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS06_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS06_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS06_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS06_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS06_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS06_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS06_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS06_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS06_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS06_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS06_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS06_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS06_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS06_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS06_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS06_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS06_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS06_0),
                                        http("request_21")
                                                .get("/static/banners/zen-button.png")
                                                .headers(headersAS06_0),
                                        http("request_22")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS06_0),
                                        http("request_23")
                                                .get("/avtor/arest-pavla-durova-v-aeroportu-le-burzhe-obzor-zapadnoj-pressy")
                                                .headers(headersAS06_23),
                                        http("request_24")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_25")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_27")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_28")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_29")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
//                                        http("request_30")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS06_0),
                                        http("request_31")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS06_3),
                                        http("request_32")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS06_3),
                                        http("request_33")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_34")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS06_0),
                                        http("request_35")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Favtor%2Farest-pavla-durova-v-aeroportu-le-burzhe-obzor-zapadnoj-pressy&page-ref=https%3A%2F%2Fasafov.ru%2Favtor&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A1049810004%3Az%3A300%3Ai%3A20240826203304%3Aet%3A1724686385%3Ac%3A1%3Arn%3A1020311825%3Arqn%3A65%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C126%2C62%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686384210%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686385%3At%3A%D0%90%D1%80%D0%B5%D1%81%D1%82%20%D0%9F%D0%B0%D0%B2%D0%BB%D0%B0%20%D0%94%D1%83%D1%80%D0%BE%D0%B2%D0%B0%20%D0%B2%20%D0%B0%D1%8D%D1%80%D0%BE%D0%BF%D0%BE%D1%80%D1%82%D1%83%20%D0%9B%D0%B5%20%D0%91%D1%83%D1%80%D0%B6%D0%B5%3A%20%D0%BE%D0%B1%D0%B7%D0%BE%D1%80%20%D0%B7%D0%B0%D0%BF%D0%B0%D0%B4%D0%BD%D0%BE%D0%B9%20%D0%BF%D1%80%D0%B5%D1%81%D1%81%D1%8B%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS06_35)
//                                        http("request_36")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS06_36)
                                )
                );

        HttpProtocolBuilder httpProtocol_NewsAuth2 = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS07_0 = new HashMap<>();
        headersAS07_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS07_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS07_0.put("sec-ch-ua-mobile", "?0");
        headersAS07_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS07_3 = new HashMap<>();
        headersAS07_3.put("Origin", "https://asafov.ru");
        headersAS07_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS07_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS07_3.put("sec-ch-ua-mobile", "?0");
        headersAS07_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS07_23 = new HashMap<>();
        headersAS07_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS07_23.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS07_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS07_23.put("priority", "u=0, i");
        headersAS07_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS07_23.put("sec-ch-ua-mobile", "?0");
        headersAS07_23.put("sec-ch-ua-platform", "Linux");
        headersAS07_23.put("sec-fetch-dest", "document");
        headersAS07_23.put("sec-fetch-mode", "navigate");
        headersAS07_23.put("sec-fetch-site", "same-origin");
        headersAS07_23.put("sec-fetch-user", "?1");
        headersAS07_23.put("upgrade-insecure-requests", "1");
        headersAS07_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS07_36 = new HashMap<>();
        headersAS07_36.put("accept", "*/*");
        headersAS07_36.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS07_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS07_36.put("origin", "https://asafov.ru");
        headersAS07_36.put("priority", "u=1, i");
        headersAS07_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS07_36.put("sec-ch-ua-mobile", "?0");
        headersAS07_36.put("sec-ch-ua-platform", "Linux");
        headersAS07_36.put("sec-fetch-dest", "empty");
        headersAS07_36.put("sec-fetch-mode", "cors");
        headersAS07_36.put("sec-fetch-site", "cross-site");
        headersAS07_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS07_37 = new HashMap<>();
        headersAS07_37.put("Upgrade-Insecure-Requests", "1");
        headersAS07_37.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS07_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS07_37.put("sec-ch-ua-mobile", "?0");
        headersAS07_37.put("sec-ch-ua-platform", "Linux");


        ScenarioBuilder scnAS07 = scenario("Projects.asafov.NewsAuth2")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS07_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS07_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS07_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS07_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS07_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS07_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS07_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS07_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS07_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS07_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS07_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS07_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS07_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS07_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS07_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS07_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS07_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS07_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS07_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS07_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS07_0),
                                        http("request_21")
                                                .get("/storage/media/2024/6/photo_2024-07-05%2015.45.04.jpeg")
                                                .headers(headersAS07_0),
                                        http("request_22")
                                                .get("/static/banners/zen-button.png")
                                                .headers(headersAS07_0),
                                        http("request_23")
                                                .get("/avtor/samye-islamskie-vybory-v-mire-finishnaya-pryamaya")
                                                .headers(headersAS07_23),
                                        http("request_24")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_25")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_27")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_28")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_29")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_30")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS07_0),
//                                        http("request_31")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS07_0),
                                        http("request_32")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS07_3),
                                        http("request_33")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS07_3),
                                        http("request_34")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_35")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS07_0),
                                        http("request_36")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Favtor%2Fsamye-islamskie-vybory-v-mire-finishnaya-pryamaya&page-ref=https%3A%2F%2Fasafov.ru%2Favtor%3Fpage%3D6&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A233949298%3Az%3A300%3Ai%3A20240826203344%3Aet%3A1724686425%3Ac%3A1%3Arn%3A510383672%3Arqn%3A69%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C128%2C62%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686424248%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686425%3At%3A%D0%A1%D0%B0%D0%BC%D1%8B%D0%B5%20%D0%B8%D1%81%D0%BB%D0%B0%D0%BC%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D1%8B%20%D0%B2%20%D0%BC%D0%B8%D1%80%D0%B5%3A%20%D1%84%D0%B8%D0%BD%D0%B8%D1%88%D0%BD%D0%B0%D1%8F%20%D0%BF%D1%80%D1%8F%D0%BC%D0%B0%D1%8F%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS07_36)
//                                        http("request_37")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS07_37)
                                )
                );

        HttpProtocolBuilder httpProtocol_NewsAuth3 = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS08_0 = new HashMap<>();
        headersAS08_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS08_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS08_0.put("sec-ch-ua-mobile", "?0");
        headersAS08_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS08_3 = new HashMap<>();
        headersAS08_3.put("Origin", "https://asafov.ru");
        headersAS08_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS08_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS08_3.put("sec-ch-ua-mobile", "?0");
        headersAS08_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS08_23 = new HashMap<>();
        headersAS08_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS08_23.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS08_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS08_23.put("priority", "u=0, i");
        headersAS08_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS08_23.put("sec-ch-ua-mobile", "?0");
        headersAS08_23.put("sec-ch-ua-platform", "Linux");
        headersAS08_23.put("sec-fetch-dest", "document");
        headersAS08_23.put("sec-fetch-mode", "navigate");
        headersAS08_23.put("sec-fetch-site", "same-origin");
        headersAS08_23.put("sec-fetch-user", "?1");
        headersAS08_23.put("upgrade-insecure-requests", "1");
        headersAS08_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS08_35 = new HashMap<>();
        headersAS08_35.put("accept", "*/*");
        headersAS08_35.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS08_35.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS08_35.put("origin", "https://asafov.ru");
        headersAS08_35.put("priority", "u=1, i");
        headersAS08_35.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS08_35.put("sec-ch-ua-mobile", "?0");
        headersAS08_35.put("sec-ch-ua-platform", "Linux");
        headersAS08_35.put("sec-fetch-dest", "empty");
        headersAS08_35.put("sec-fetch-mode", "cors");
        headersAS08_35.put("sec-fetch-site", "cross-site");
        headersAS08_35.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS08_36 = new HashMap<>();
        headersAS08_36.put("Upgrade-Insecure-Requests", "1");
        headersAS08_36.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS08_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS08_36.put("sec-ch-ua-mobile", "?0");
        headersAS08_36.put("sec-ch-ua-platform", "Linux");


        ScenarioBuilder scnAS08 = scenario("Projects.asafov.NewsAuth3")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS08_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS08_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS08_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS08_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS08_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS08_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS08_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS08_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS08_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS08_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS08_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS08_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS08_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS08_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS08_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS08_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS08_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS08_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS08_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS08_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS08_0),
                                        http("request_21")
                                                .get("/static/banners/zen-button.png")
                                                .headers(headersAS08_0),
                                        http("request_22")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS08_0),
                                        http("request_23")
                                                .get("/avtor/odnoj-iz-osobennostej-vyborov-glav-su")
                                                .headers(headersAS08_23),
                                        http("request_24")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_25")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_27")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_28")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_29")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
//                                        http("request_30")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS08_0),
                                        http("request_31")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS08_3),
                                        http("request_32")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS08_3),
                                        http("request_33")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_34")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS08_0),
                                        http("request_35")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Favtor%2Fodnoj-iz-osobennostej-vyborov-glav-su&page-ref=https%3A%2F%2Fasafov.ru%2Favtor%3Fpage%3D116&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A858466777%3Az%3A300%3Ai%3A20240826203503%3Aet%3A1724686504%3Ac%3A1%3Arn%3A26762664%3Arqn%3A74%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C140%2C60%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686503101%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686504%3At%3A%D0%9E%D0%B4%D0%BD%D0%BE%D0%B9%20%D0%B8%D0%B7%20%D0%BE%D1%81%D0%BE%D0%B1%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B5%D0%B9%20%D0%B2%D1%8B%D0%B1%D0%BE%D1%80%D0%BE%D0%B2%20%D0%B3%D0%BB%D0%B0%D0%B2%20%D1%81%D1%83%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BE%D0%B2%20%D0%B2%202020%20%D0%B3%D0%BE%D0%B4%D1%83%20%D1%8F%D0%B2%D0%BB%D1%8F%D0%B5%D1%82%D1%81%D1%8F%20%D1%81%D0%BE%D0%B2%D0%BF%D0%B0%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5%20%D0%BF%D0%BE%20%D0%B2%D1%80%D0%B5%D0%BC%D0%B5%D0%BD%D0%B8%20%D1%81%20%D0%B4%D1%80%D1%83%D0%B3%D0%B8%D0%BC%D0%B8%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%BC%D0%B8%20%D1%81%D0%BE%D0%B1%D1%8B%D1%82%D0%B8%D1%8F%D0%BC%D0%B8%20%D0%B8%20%D0%BE%D0%B1%D1%81%D1%82%D0%BE%D1%8F%D1%82%D0%B5%D0%BB%D1%8C%D1%81%D1%82%D0%B2%D0%B0%D0%BC%D0%B8%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS08_35)
//                                        http("request_36")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS08_36)
                                )
                );

        HttpProtocolBuilder httpProtocol_NewsStat1 = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS09_0 = new HashMap<>();
        headersAS09_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS09_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS09_0.put("sec-ch-ua-mobile", "?0");
        headersAS09_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS09_3 = new HashMap<>();
        headersAS09_3.put("Origin", "https://asafov.ru");
        headersAS09_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS09_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS09_3.put("sec-ch-ua-mobile", "?0");
        headersAS09_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS09_23 = new HashMap<>();
        headersAS09_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS09_23.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS09_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS09_23.put("priority", "u=0, i");
        headersAS09_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS09_23.put("sec-ch-ua-mobile", "?0");
        headersAS09_23.put("sec-ch-ua-platform", "Linux");
        headersAS09_23.put("sec-fetch-dest", "document");
        headersAS09_23.put("sec-fetch-mode", "navigate");
        headersAS09_23.put("sec-fetch-site", "same-origin");
        headersAS09_23.put("sec-fetch-user", "?1");
        headersAS09_23.put("upgrade-insecure-requests", "1");
        headersAS09_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS09_36 = new HashMap<>();
        headersAS09_36.put("accept", "*/*");
        headersAS09_36.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS09_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS09_36.put("origin", "https://asafov.ru");
        headersAS09_36.put("priority", "u=1, i");
        headersAS09_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS09_36.put("sec-ch-ua-mobile", "?0");
        headersAS09_36.put("sec-ch-ua-platform", "Linux");
        headersAS09_36.put("sec-fetch-dest", "empty");
        headersAS09_36.put("sec-fetch-mode", "cors");
        headersAS09_36.put("sec-fetch-site", "cross-site");
        headersAS09_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS09_37 = new HashMap<>();
        headersAS09_37.put("Upgrade-Insecure-Requests", "1");
        headersAS09_37.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS09_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS09_37.put("sec-ch-ua-mobile", "?0");
        headersAS09_37.put("sec-ch-ua-platform", "Linux");


        ScenarioBuilder scnAS09 = scenario("Projects.asafov.NewsStat1")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS09_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS09_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS09_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS09_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS09_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS09_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS09_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS09_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS09_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS09_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS09_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS09_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS09_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS09_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS09_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS09_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS09_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS09_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS09_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS09_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS09_0),
                                        http("request_21")
                                                .get("/storage/media/2023/09/photofunia-1693903644.jpg")
                                                .headers(headersAS09_0),
                                        http("request_22")
                                                .get("/static/banners/zen-button.png")
                                                .headers(headersAS09_0),
                                        http("request_23")
                                                .get("/russia/tinao-osobennosti-elektoralnoj-kampanii-v-novoj-moskve")
                                                .headers(headersAS09_23),
                                        http("request_24")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_25")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_27")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_28")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_29")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_30")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS09_0),
//                                        http("request_31")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS09_0),
                                        http("request_32")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS09_3),
                                        http("request_33")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS09_3),
                                        http("request_34")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_35")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS09_0),
                                        http("request_36")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Frussia%2Ftinao-osobennosti-elektoralnoj-kampanii-v-novoj-moskve&page-ref=https%3A%2F%2Fasafov.ru%2Frussia&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A535560550%3Az%3A300%3Ai%3A20240826203616%3Aet%3A1724686576%3Ac%3A1%3Arn%3A288781248%3Arqn%3A78%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C162%2C61%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686575871%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686576%3At%3A%D0%A2%D0%B8%D0%9D%D0%90%D0%9E%3A%20%D0%BE%D1%81%D0%BE%D0%B1%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D1%8D%D0%BB%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%B9%20%D0%BA%D0%B0%D0%BC%D0%BF%D0%B0%D0%BD%D0%B8%D0%B8%20%D0%B2%20%D0%9D%D0%BE%D0%B2%D0%BE%D0%B9%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5%20%E2%80%8B%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS09_36)
//                                        http("request_37")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS09_37)
                                )
                );

        HttpProtocolBuilder httpProtocol_NewsStat2 = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS10_0 = new HashMap<>();
        headersAS10_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS10_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS10_0.put("sec-ch-ua-mobile", "?0");
        headersAS10_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS10_3 = new HashMap<>();
        headersAS10_3.put("Origin", "https://asafov.ru");
        headersAS10_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS10_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS10_3.put("sec-ch-ua-mobile", "?0");
        headersAS10_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS10_23 = new HashMap<>();
        headersAS10_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS10_23.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS10_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS10_23.put("priority", "u=0, i");
        headersAS10_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS10_23.put("sec-ch-ua-mobile", "?0");
        headersAS10_23.put("sec-ch-ua-platform", "Linux");
        headersAS10_23.put("sec-fetch-dest", "document");
        headersAS10_23.put("sec-fetch-mode", "navigate");
        headersAS10_23.put("sec-fetch-site", "same-origin");
        headersAS10_23.put("sec-fetch-user", "?1");
        headersAS10_23.put("upgrade-insecure-requests", "1");
        headersAS10_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS10_36 = new HashMap<>();
        headersAS10_36.put("accept", "*/*");
        headersAS10_36.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS10_36.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS10_36.put("origin", "https://asafov.ru");
        headersAS10_36.put("priority", "u=1, i");
        headersAS10_36.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS10_36.put("sec-ch-ua-mobile", "?0");
        headersAS10_36.put("sec-ch-ua-platform", "Linux");
        headersAS10_36.put("sec-fetch-dest", "empty");
        headersAS10_36.put("sec-fetch-mode", "cors");
        headersAS10_36.put("sec-fetch-site", "cross-site");
        headersAS10_36.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS10_37 = new HashMap<>();
        headersAS10_37.put("Upgrade-Insecure-Requests", "1");
        headersAS10_37.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS10_37.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS10_37.put("sec-ch-ua-mobile", "?0");
        headersAS10_37.put("sec-ch-ua-platform", "Linux");



        ScenarioBuilder scnAS10 = scenario("Projects.asafov.NewsStat2")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS10_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS10_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS10_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS10_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS10_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS10_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS10_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS10_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS10_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS10_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS10_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS10_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS10_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS10_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS10_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS10_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS10_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS10_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS10_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS10_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS10_0),
                                        http("request_21")
                                                .get("/storage/media/2022/01/whatsapp-image-2022-01-11-at-16.29.08.jpeg")
                                                .headers(headersAS10_0),
                                        http("request_22")
                                                .get("/static/banners/zen-button.png")
                                                .headers(headersAS10_0),
                                        http("request_23")
                                                .get("/russia/press-konferencziya-prezidenta-rossii-osobennosti-formata")
                                                .headers(headersAS10_23),
                                        http("request_24")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_25")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_27")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_28")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_29")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_30")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS10_0),
//                                        http("request_31")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS10_0),
                                        http("request_32")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS10_3),
                                        http("request_33")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS10_3),
                                        http("request_34")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_35")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS10_0),
                                        http("request_36")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Frussia%2Fpress-konferencziya-prezidenta-rossii-osobennosti-formata&page-ref=https%3A%2F%2Fasafov.ru%2Frussia%3Fpage%3D2&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A464649453%3Az%3A300%3Ai%3A20240826204016%3Aet%3A1724686816%3Ac%3A1%3Arn%3A234695057%3Arqn%3A84%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C118%2C63%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686815780%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686816%3At%3A%D0%9F%D1%80%D0%B5%D1%81%D1%81-%D0%BA%D0%BE%D0%BD%D1%84%D0%B5%D1%80%D0%B5%D0%BD%D1%86%D0%B8%D1%8F%20%D0%BF%D1%80%D0%B5%D0%B7%D0%B8%D0%B4%D0%B5%D0%BD%D1%82%D0%B0%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%3A%20%D0%BE%D1%81%D0%BE%D0%B1%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D1%84%D0%BE%D1%80%D0%BC%D0%B0%D1%82%D0%B0%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS10_36)
//                                        http("request_37")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS10_37)
                                )
                );

//        Установки

        setUp(
                scnAS03.injectClosed(
                        constantConcurrentUsers(users_flood_AS03).during(40000)
                ).protocols(httpProtocol_News1)
                ,
                scnAS04.injectClosed(
                        constantConcurrentUsers(users_flood_AS04).during(40000)
                ).protocols(httpProtocol_News2)
                ,
                scnAS05.injectClosed(
                        constantConcurrentUsers(users_flood_AS05).during(40000)
                ).protocols(httpProtocol_News3)
                ,
                scnAS06.injectClosed(
                        constantConcurrentUsers(users_flood_AS06).during(40000)
                ).protocols(httpProtocol_NewsAuth1)
                ,
                scnAS07.injectClosed(
                        constantConcurrentUsers(users_flood_AS07).during(40000)
                ).protocols(httpProtocol_NewsAuth2)
                ,
                scnAS08.injectClosed(
                        constantConcurrentUsers(users_flood_AS08).during(40000)
                ).protocols(httpProtocol_NewsAuth3)
                ,
                scnAS09.injectClosed(
                        constantConcurrentUsers(users_flood_AS09).during(40000)
                ).protocols(httpProtocol_NewsStat1)
                ,
                scnAS10.injectClosed(
                        constantConcurrentUsers(users_flood_AS10).during(40000)
                ).protocols(httpProtocol_NewsStat2)

        );
    }
}