package Simulations;

import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;
import java.net.URLEncoder;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.http;

public class ASAF02 extends Simulation {

//Метод для выбора случайного значения
    private static final List<String> searchTerms = Arrays.asList("Зюганов", "Жириновский", "Володин", "Малахов", "Краснов");

    private String getRandomSearchTerm() {
        int randomIndex = ThreadLocalRandom.current().nextInt(searchTerms.size());
        return searchTerms.get(randomIndex);
    }

    private String encodeSearchTerm(String searchTerm) {
        try {
            return URLEncoder.encode(searchTerm, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported", e);
        }
    }

    {
        int users_flood_AS11 = Integer.getInteger("users_flood_AS11", 1);
        int users_flood_AS12 = Integer.getInteger("users_flood_AS12", 1);
        int users_flood_AS13 = Integer.getInteger("users_flood_AS13", 1);
        int users_flood_AS14 = Integer.getInteger("users_flood_AS14", 1);
        int users_flood_AS15 = Integer.getInteger("users_flood_AS15", 1);
        int users_flood_AS19 = Integer.getInteger("users_flood_AS19", 1);
        int users_flood_AS20 = Integer.getInteger("users_flood_AS20", 1);
        int users_flood_AS23 = Integer.getInteger("users_flood_AS23", 1);


        // "Задайте вопрос про ДЭГ"
        Random RandomForAS19  = new Random();

// Scenarious

        HttpProtocolBuilder httpProtocol_TradCen = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS11_0 = new HashMap<>();
        headersAS11_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS11_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS11_0.put("sec-ch-ua-mobile", "?0");
        headersAS11_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS11_4 = new HashMap<>();
        headersAS11_4.put("Origin", "https://asafov.ru");
        headersAS11_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS11_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS11_4.put("sec-ch-ua-mobile", "?0");
        headersAS11_4.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS11_53 = new HashMap<>();
        headersAS11_53.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS11_53.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS11_53.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS11_53.put("priority", "u=0, i");
        headersAS11_53.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS11_53.put("sec-ch-ua-mobile", "?0");
        headersAS11_53.put("sec-ch-ua-platform", "Linux");
        headersAS11_53.put("sec-fetch-dest", "document");
        headersAS11_53.put("sec-fetch-mode", "navigate");
        headersAS11_53.put("sec-fetch-site", "same-origin");
        headersAS11_53.put("sec-fetch-user", "?1");
        headersAS11_53.put("upgrade-insecure-requests", "1");
        headersAS11_53.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS11_69 = new HashMap<>();
        headersAS11_69.put("accept", "*/*");
        headersAS11_69.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS11_69.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS11_69.put("origin", "https://asafov.ru");
        headersAS11_69.put("priority", "u=1, i");
        headersAS11_69.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS11_69.put("sec-ch-ua-mobile", "?0");
        headersAS11_69.put("sec-ch-ua-platform", "Linux");
        headersAS11_69.put("sec-fetch-dest", "empty");
        headersAS11_69.put("sec-fetch-mode", "cors");
        headersAS11_69.put("sec-fetch-site", "cross-site");
        headersAS11_69.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS11_70 = new HashMap<>();
        headersAS11_70.put("Upgrade-Insecure-Requests", "1");
        headersAS11_70.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS11_70.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS11_70.put("sec-ch-ua-mobile", "?0");
        headersAS11_70.put("sec-ch-ua-platform", "Linux");

        String uri1 = "https://mc.yandex.ru";

        ScenarioBuilder scnAS11 = scenario("Projects.asafov.TradCen")
                .exec(
                        http("request_0")
                                .get("/assets/css/plugins.css")
                                .headers(headersAS11_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/app-C22gTps0.css")
                                                .headers(headersAS11_0),
                                        http("request_2")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS11_0),
                                        http("request_3")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS11_0),
                                        http("request_4")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS11_4),
                                        http("request_5")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS11_4),
                                        http("request_6")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS11_4),
                                        http("request_7")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS11_0),
                                        http("request_8")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS11_0),
                                        http("request_9")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS11_0),
                                        http("request_10")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS11_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS11_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS11_0),
                                        http("request_13")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS11_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS11_0),
                                        http("request_15")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS11_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS11_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS11_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS11_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS11_0),
                                        http("request_20")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS11_0),
                                        http("request_21")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS11_0),
                                        http("request_22")
                                                .get("/assets/img/spec/05.jpg")
                                                .headers(headersAS11_0),
                                        http("request_23")
                                                .get("/assets/img/spec/01strana_01.jpg")
                                                .headers(headersAS11_0),
                                        http("request_24")
                                                .get("/assets/img/spec/02obshhestvo_01.jpg")
                                                .headers(headersAS11_0),
                                        http("request_25")
                                                .get("/assets/img/spec/03chelovek_01.jpg")
                                                .headers(headersAS11_0),
                                        http("request_26")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__1.jpg")
                                                .headers(headersAS11_0),
                                        http("request_27")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__2.jpg")
                                                .headers(headersAS11_0),
                                        http("request_28")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__3.jpg")
                                                .headers(headersAS11_0),
                                        http("request_29")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__4.jpg")
                                                .headers(headersAS11_0),
                                        http("request_30")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__5.jpg")
                                                .headers(headersAS11_0),
                                        http("request_31")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__6.jpg")
                                                .headers(headersAS11_0),
                                        http("request_32")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__7.jpg")
                                                .headers(headersAS11_0),
                                        http("request_33")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__8.jpg")
                                                .headers(headersAS11_0),
                                        http("request_34")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__9.jpg")
                                                .headers(headersAS11_0),
                                        http("request_35")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__10.jpg")
                                                .headers(headersAS11_0),
                                        http("request_36")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__11.jpg")
                                                .headers(headersAS11_0),
                                        http("request_37")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__12.jpg")
                                                .headers(headersAS11_0),
                                        http("request_38")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__13.jpg")
                                                .headers(headersAS11_0),
                                        http("request_39")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__14.jpg")
                                                .headers(headersAS11_0),
                                        http("request_40")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__15.jpg")
                                                .headers(headersAS11_0),
                                        http("request_41")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__16.jpg")
                                                .headers(headersAS11_0),
                                        http("request_42")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__17.jpg")
                                                .headers(headersAS11_0),
                                        http("request_43")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__18.jpg")
                                                .headers(headersAS11_0),
                                        http("request_44")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__19.jpg")
                                                .headers(headersAS11_0),
                                        http("request_45")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__20.jpg")
                                                .headers(headersAS11_0),
                                        http("request_46")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__21.jpg")
                                                .headers(headersAS11_0),
                                        http("request_47")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__22.jpg")
                                                .headers(headersAS11_0),
                                        http("request_48")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__23.jpg")
                                                .headers(headersAS11_0),
                                        http("request_49")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__24.jpg")
                                                .headers(headersAS11_0),
                                        http("request_50")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__25.jpg")
                                                .headers(headersAS11_0),
                                        http("request_51")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__26.jpg")
                                                .headers(headersAS11_0),
                                        http("request_52")
                                                .get("/assets/img/spec/traditio/kartochka_trdnczennosti__27.jpg")
                                                .headers(headersAS11_0),
                                        http("request_53")
                                                .get("/spec/traditio")
                                                .headers(headersAS11_53),
                                        http("request_54")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_55")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_56")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_57")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_58")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_59")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_60")
                                                .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
                                        http("request_61")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS11_0),
                                        http("request_62")
                                                .get("/assets/js/front/glightbox.min.js")
                                                .headers(headersAS11_4),
                                        http("request_63")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_64")
                                                .get("/assets/js/front/lightbox.js")
                                                .headers(headersAS11_4),
//                                        http("request_65")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS11_0),
                                        http("request_66")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS11_4),
                                        http("request_67")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS11_4),
                                        http("request_68")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS11_0),
                                        http("request_69")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Ftraditio&page-ref=https%3A%2F%2Fasafov.ru%2Fworld%2Fukrainskij-naczizm-osnovnye-istochniki-i-sostavnye-chasti&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A980645755%3Az%3A300%3Ai%3A20240826204155%3Aet%3A1724686916%3Ac%3A1%3Arn%3A897026199%3Arqn%3A91%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C120%2C65%2C1%2C0%2C%2C403%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724686914822%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724686916%3At%3A%D0%A2%D1%80%D0%B0%D0%B4%D0%B8%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D0%B5%20%D1%80%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B5%20%D0%B4%D1%83%D1%85%D0%BE%D0%B2%D0%BD%D0%BE-%D0%BD%D1%80%D0%B0%D0%B2%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D0%B5%20%D1%86%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%B2%20%D0%BA%D0%BE%D0%BD%D1%86%D0%B5%D0%BF%D1%86%D0%B8%D0%B8%20%C2%AB%D0%94%D0%9D%D0%9A%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%C2%BB&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS11_69)
//                                        http("request_70")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS11_70)
                                )
                );

        HttpProtocolBuilder httpProtocol_Baza = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS12_0 = new HashMap<>();
        headersAS12_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS12_0.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS12_0.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS12_0.put("priority", "u=0, i");
        headersAS12_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS12_0.put("sec-ch-ua-mobile", "?0");
        headersAS12_0.put("sec-ch-ua-platform", "Linux");
        headersAS12_0.put("sec-fetch-dest", "document");
        headersAS12_0.put("sec-fetch-mode", "navigate");
        headersAS12_0.put("sec-fetch-site", "same-origin");
        headersAS12_0.put("sec-fetch-user", "?1");
        headersAS12_0.put("upgrade-insecure-requests", "1");
        headersAS12_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS12_1 = new HashMap<>();
        headersAS12_1.put("Origin", "https://asafov.ru");
        headersAS12_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS12_1.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS12_1.put("sec-ch-ua-mobile", "?0");
        headersAS12_1.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS12_11 = new HashMap<>();
        headersAS12_11.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS12_11.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS12_11.put("sec-ch-ua-mobile", "?0");
        headersAS12_11.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS12_12 = new HashMap<>();
        headersAS12_12.put("accept", "*/*");
        headersAS12_12.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS12_12.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS12_12.put("origin", "https://asafov.ru");
        headersAS12_12.put("priority", "u=1, i");
        headersAS12_12.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS12_12.put("sec-ch-ua-mobile", "?0");
        headersAS12_12.put("sec-ch-ua-platform", "Linux");
        headersAS12_12.put("sec-fetch-dest", "empty");
        headersAS12_12.put("sec-fetch-mode", "cors");
        headersAS12_12.put("sec-fetch-site", "cross-site");
        headersAS12_12.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS12_13 = new HashMap<>();
        headersAS12_13.put("Upgrade-Insecure-Requests", "1");
        headersAS12_13.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS12_13.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS12_13.put("sec-ch-ua-mobile", "?0");
        headersAS12_13.put("sec-ch-ua-platform", "Linux");



        ScenarioBuilder scnAS12 = scenario("Projects.asafov.Baza")
                .exec(
                        http("request_0")
                                .get("/spec/baza")
                                .headers(headersAS12_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS12_1),
                                        http("request_2")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS12_1),
                                        http("request_3")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_4")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_5")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_6")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_7")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_8")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_9")
                                                .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
                                        http("request_10")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
//                                        http("request_11")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS12_11),
                                        http("request_12")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Fbaza&page-ref=https%3A%2F%2Fasafov.ru%2Fworld%2Fukrainskij-naczizm-osnovnye-istochniki-i-sostavnye-chasti&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A548275838%3Az%3A300%3Ai%3A20240826204322%3Aet%3A1724687002%3Ac%3A1%3Arn%3A23778320%3Arqn%3A93%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A534%3Awv%3A2%3Ads%3A0%2C0%2C105%2C4%2C1%2C0%2C%2C517%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724687001543%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724687002%3At%3A%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D1%8B%20%D0%B3%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D0%BE%D0%B9%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%B8%20%D0%BF%D0%BE%20%D1%81%D0%BE%D1%85%D1%80%D0%B0%D0%BD%D0%B5%D0%BD%D0%B8%D1%8E%20%D0%B8%20%D1%83%D0%BA%D1%80%D0%B5%D0%BF%D0%BB%D0%B5%D0%BD%D0%B8%D1%8E%20%D1%82%D1%80%D0%B0%D0%B4%D0%B8%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D1%85%20%D1%80%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D1%85%20%D0%B4%D1%83%D1%85%D0%BE%D0%B2%D0%BD%D0%BE-%D0%BD%D1%80%D0%B0%D0%B2%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D1%8B%D1%85%20%D1%86%D0%B5%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B5%D0%B9%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS12_12)
//                                        http("request_13")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS12_13)
                                )
                );

        HttpProtocolBuilder httpProtocol_Strategy = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> AS13headers_0 = new HashMap<>();
        AS13headers_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        AS13headers_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        AS13headers_0.put("sec-ch-ua-mobile", "?0");
        AS13headers_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS13_4 = new HashMap<>();
        headersAS13_4.put("Origin", "https://asafov.ru");
        headersAS13_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS13_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS13_4.put("sec-ch-ua-mobile", "?0");
        headersAS13_4.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS13_22 = new HashMap<>();
        headersAS13_22.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS13_22.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS13_22.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS13_22.put("priority", "u=0, i");
        headersAS13_22.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS13_22.put("sec-ch-ua-mobile", "?0");
        headersAS13_22.put("sec-ch-ua-platform", "Linux");
        headersAS13_22.put("sec-fetch-dest", "document");
        headersAS13_22.put("sec-fetch-mode", "navigate");
        headersAS13_22.put("sec-fetch-site", "same-origin");
        headersAS13_22.put("sec-fetch-user", "?1");
        headersAS13_22.put("upgrade-insecure-requests", "1");
        headersAS13_22.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS13_44 = new HashMap<>();
        headersAS13_44.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
        headersAS13_44.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS13_44.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS13_44.put("priority", "i");
        headersAS13_44.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS13_44.put("sec-ch-ua-mobile", "?0");
        headersAS13_44.put("sec-ch-ua-platform", "Linux");
        headersAS13_44.put("sec-fetch-dest", "image");
        headersAS13_44.put("sec-fetch-mode", "no-cors");
        headersAS13_44.put("sec-fetch-site", "same-origin");
        headersAS13_44.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS13_49 = new HashMap<>();
        headersAS13_49.put("accept", "*/*");
        headersAS13_49.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS13_49.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS13_49.put("origin", "https://asafov.ru");
        headersAS13_49.put("priority", "u=1, i");
        headersAS13_49.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS13_49.put("sec-ch-ua-mobile", "?0");
        headersAS13_49.put("sec-ch-ua-platform", "Linux");
        headersAS13_49.put("sec-fetch-dest", "empty");
        headersAS13_49.put("sec-fetch-mode", "cors");
        headersAS13_49.put("sec-fetch-site", "cross-site");
        headersAS13_49.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS13_50 = new HashMap<>();
        headersAS13_50.put("Upgrade-Insecure-Requests", "1");
        headersAS13_50.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS13_50.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS13_50.put("sec-ch-ua-mobile", "?0");
        headersAS13_50.put("sec-ch-ua-platform", "Linux");


        ScenarioBuilder scnAS13 = scenario("Projects.asafov.Strategy")
                .exec(
                        http("request_0")
                                .get("/assets/css/plugins.css")
                                .headers(AS13headers_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/app-C22gTps0.css")
                                                .headers(AS13headers_0),
                                        http("request_2")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(AS13headers_0),
                                        http("request_3")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(AS13headers_0),
                                        http("request_4")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS13_4),
                                        http("request_5")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS13_4),
                                        http("request_6")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS13_4),
                                        http("request_7")
                                                .get("/assets/css/cookies.css")
                                                .headers(AS13headers_0),
                                        http("request_8")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(AS13headers_0),
                                        http("request_9")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(AS13headers_0),
                                        http("request_10")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(AS13headers_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(AS13headers_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(AS13headers_0),
                                        http("request_13")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(AS13headers_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(AS13headers_0),
                                        http("request_15")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(AS13headers_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(AS13headers_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(AS13headers_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(AS13headers_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(AS13headers_0),
                                        http("request_20")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(AS13headers_0),
                                        http("request_21")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(AS13headers_0),
                                        http("request_22")
                                                .get("/spec/strategy")
                                                .headers(headersAS13_22),
                                        http("request_23")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_24")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_25")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_27")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_28")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_29")
                                                .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
                                        http("request_30")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(AS13headers_0),
                                        http("request_31")
                                                .get("/assets/js/front/glightbox.min.js")
                                                .headers(headersAS13_4),
                                        http("request_32")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_11.jpg")
                                                .headers(AS13headers_0),
                                        http("request_33")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_12.jpg")
                                                .headers(AS13headers_0),
                                        http("request_34")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_21.jpg")
                                                .headers(AS13headers_0),
                                        http("request_35")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_24.jpg")
                                                .headers(AS13headers_0),
                                        http("request_36")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_23.jpg")
                                                .headers(AS13headers_0),
                                        http("request_37")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_28.jpg")
                                                .headers(AS13headers_0),
                                        http("request_38")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_26.jpg")
                                                .headers(AS13headers_0),
                                        http("request_39")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_30.jpg")
                                                .headers(AS13headers_0),
                                        http("request_40")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_29.jpg")
                                                .headers(AS13headers_0),
                                        http("request_41")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_31.jpg")
                                                .headers(AS13headers_0),
                                        http("request_42")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_45.jpg")
                                                .headers(AS13headers_0),
                                        http("request_43")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_46.jpg")
                                                .headers(AS13headers_0),
                                        http("request_44")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_1.jpg")
                                                .headers(headersAS13_44),
                                        http("request_45")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
//                                        http("request_46")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(AS13headers_0),
                                        http("request_47")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS13_4),
                                        http("request_48")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS13_4),
                                        http("request_49")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Fstrategy&page-ref=https%3A%2F%2Fasafov.ru%2Fspec%2Fbaza&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A877085664%3Az%3A300%3Ai%3A20240826204419%3Aet%3A1724687060%3Ac%3A1%3Arn%3A1002873315%3Arqn%3A94%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C134%2C61%2C4%2C0%2C%2C1243%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724687058120%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724687060%3At%3A%D0%A1%D1%82%D1%80%D0%B0%D1%82%D0%B5%D0%B3%D0%B8%D1%8F%20%D0%BD%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D0%B9%20%D0%B1%D0%B5%D0%B7%D0%BE%D0%BF%D0%B0%D1%81%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS13_49),
//                                        http("request_50")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS13_50),
                                        http("request_51")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_2.jpg")
                                                .headers(headersAS13_44),
                                        http("request_52")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_4.jpg")
                                                .headers(headersAS13_44),
                                        http("request_53")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_14.jpg")
                                                .headers(headersAS13_44),
                                        http("request_54")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_8.jpg")
                                                .headers(headersAS13_44),
                                        http("request_55")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_10.jpg")
                                                .headers(headersAS13_44),
                                        http("request_56")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_9.jpg")
                                                .headers(headersAS13_44),
                                        http("request_57")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_6.jpg")
                                                .headers(headersAS13_44),
                                        http("request_58")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_7.jpg")
                                                .headers(headersAS13_44),
                                        http("request_59")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_3.jpg")
                                                .headers(headersAS13_44),
                                        http("request_60")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_5.jpg")
                                                .headers(headersAS13_44),
                                        http("request_61")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_13.jpg")
                                                .headers(headersAS13_44),
                                        http("request_62")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_18.jpg")
                                                .headers(headersAS13_44),
                                        http("request_63")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_17.jpg")
                                                .headers(headersAS13_44),
                                        http("request_64")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_22.jpg")
                                                .headers(headersAS13_44),
                                        http("request_65")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_15.jpg")
                                                .headers(headersAS13_44),
                                        http("request_66")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_25.jpg")
                                                .headers(headersAS13_44),
                                        http("request_67")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_27.jpg")
                                                .headers(headersAS13_44),
                                        http("request_68")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_20.jpg")
                                                .headers(headersAS13_44),
                                        http("request_69")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_19.jpg")
                                                .headers(headersAS13_44),
                                        http("request_70")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_16.jpg")
                                                .headers(headersAS13_44),
                                        http("request_71")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_32.jpg")
                                                .headers(headersAS13_44),
                                        http("request_72")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_34.jpg")
                                                .headers(headersAS13_44),
                                        http("request_73")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_33.jpg")
                                                .headers(headersAS13_44),
                                        http("request_74")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_36.jpg")
                                                .headers(headersAS13_44),
                                        http("request_75")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_35.jpg")
                                                .headers(headersAS13_44),
                                        http("request_76")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_44.jpg")
                                                .headers(headersAS13_44),
                                        http("request_77")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_38.jpg")
                                                .headers(headersAS13_44),
                                        http("request_78")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_37.jpg")
                                                .headers(headersAS13_44),
                                        http("request_79")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_40.jpg")
                                                .headers(headersAS13_44),
                                        http("request_80")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_39.jpg")
                                                .headers(headersAS13_44),
                                        http("request_81")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_42.jpg")
                                                .headers(headersAS13_44),
                                        http("request_82")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_41.jpg")
                                                .headers(headersAS13_44),
                                        http("request_83")
                                                .get("/assets/img/spec/strategy/kartochki_naczbez_43.jpg")
                                                .headers(headersAS13_44),
                                        http("request_84")
                                                .get("/build/assets/chevron-right-black-B6v7mHTl.svg")
                                                .headers(headersAS13_4)
                                )
                );


                HttpProtocolBuilder httpProtocol_HeroesZi = http
                        .baseUrl("https://asafov.ru")
                        .inferHtmlResources()
                        ;

                Map<CharSequence, String> headers_0 = new HashMap<>();
                headers_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_0.put("sec-ch-ua-mobile", "?0");
                headers_0.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_4 = new HashMap<>();
                headers_4.put("Origin", "https://asafov.ru");
                headers_4.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_4.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_4.put("sec-ch-ua-mobile", "?0");
                headers_4.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headers_23 = new HashMap<>();
                headers_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
                headers_23.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_23.put("priority", "u=0, i");
                headers_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_23.put("sec-ch-ua-mobile", "?0");
                headers_23.put("sec-ch-ua-platform", "Linux");
                headers_23.put("sec-fetch-dest", "document");
                headers_23.put("sec-fetch-mode", "navigate");
                headers_23.put("sec-fetch-site", "same-origin");
                headers_23.put("sec-fetch-user", "?1");
                headers_23.put("upgrade-insecure-requests", "1");
                headers_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_50 = new HashMap<>();
                headers_50.put("accept", "*/*");
                headers_50.put("accept-encoding", "gzip, deflate, br, zstd");
                headers_50.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headers_50.put("origin", "https://asafov.ru");
                headers_50.put("priority", "u=1, i");
                headers_50.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_50.put("sec-ch-ua-mobile", "?0");
                headers_50.put("sec-ch-ua-platform", "Linux");
                headers_50.put("sec-fetch-dest", "empty");
                headers_50.put("sec-fetch-mode", "cors");
                headers_50.put("sec-fetch-site", "cross-site");
                headers_50.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

                Map<CharSequence, String> headers_51 = new HashMap<>();
                headers_51.put("Upgrade-Insecure-Requests", "1");
                headers_51.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
                headers_51.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headers_51.put("sec-ch-ua-mobile", "?0");
                headers_51.put("sec-ch-ua-platform", "Linux");

                Map<CharSequence, String> headersAS14_52 = new HashMap<>();
                headersAS14_52.put("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
                headersAS14_52.put("accept-encoding", "gzip, deflate, br, zstd");
                headersAS14_52.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
                headersAS14_52.put("priority", "i");
                headersAS14_52.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
                headersAS14_52.put("sec-ch-ua-mobile", "?0");
                headersAS14_52.put("sec-ch-ua-platform", "Linux");
                headersAS14_52.put("sec-fetch-dest", "image");
                headersAS14_52.put("sec-fetch-mode", "no-cors");
                headersAS14_52.put("sec-fetch-site", "same-origin");
                headersAS14_52.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");



                ScenarioBuilder scnAS14 = scenario("Projects.asafov.HeroesZ")
                        .exec(
                                http("request_0")
                                        .get("/assets/css/plugins.css")
                                        .headers(headers_0)
                                        .resources(
                                                http("request_1")
                                                        .get("/build/assets/app-C22gTps0.css")
                                                        .headers(headers_0),
                                                http("request_2")
                                                        .get("/build/assets/element-BvquaXif.css")
                                                        .headers(headers_0),
                                                http("request_3")
                                                        .get("/build/assets/app-CIZP6loT.css")
                                                        .headers(headers_0),
                                                http("request_4")
                                                        .get("/build/assets/app-DfRqwiiA.js")
                                                        .headers(headers_4),
                                                http("request_5")
                                                        .get("/build/assets/element-zM6ahEp_.js")
                                                        .headers(headers_4),
                                                http("request_6")
                                                        .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                        .headers(headers_4),
                                                http("request_7")
                                                        .get("/assets/css/cookies.css")
                                                        .headers(headers_0),
                                                http("request_8")
                                                        .get("/assets/header/images/btn-burger.svg")
                                                        .headers(headers_0),
                                                http("request_9")
                                                        .get("/assets/header/images/logos/mobile-logo.svg")
                                                        .headers(headers_0),
                                                http("request_10")
                                                        .get("/assets/header/images/btn-search-white.svg")
                                                        .headers(headers_0),
                                                http("request_11")
                                                        .get("/assets/header/images/logos/telegram-sm.svg")
                                                        .headers(headers_0),
                                                http("request_12")
                                                        .get("/assets/header/images/logos/vk-sm.svg")
                                                        .headers(headers_0),
                                                http("request_13")
                                                        .get("/assets/header/images/logos/dzen-sm.svg")
                                                        .headers(headers_0),
                                                http("request_14")
                                                        .get("/assets/header/images/icons/x-mark.svg")
                                                        .headers(headers_0),
                                                http("request_15")
                                                        .get("/assets/header/images/icons/quote.svg")
                                                        .headers(headers_0),
                                                http("request_16")
                                                        .get("/assets/header/images/logos/telegram-xs.svg")
                                                        .headers(headers_0),
                                                http("request_17")
                                                        .get("/assets/header/images/logos/vk-xs.svg")
                                                        .headers(headers_0),
                                                http("request_18")
                                                        .get("/assets/header/images/logos/dzen-xs.svg")
                                                        .headers(headers_0),
                                                http("request_19")
                                                        .get("/assets/header/images/logos/logo-asafov.svg")
                                                        .headers(headers_0),
                                                http("request_20")
                                                        .get("/assets/header/images/logos/certificate.svg")
                                                        .headers(headers_0),
                                                http("request_21")
                                                        .get("/assets/header/images/btn-search-black.svg")
                                                        .headers(headers_0),
                                                http("request_22")
                                                        .get("/assets/img/spec/whatsapp-image-2022-05-07-at-22.01.19.jpeg")
                                                        .headers(headers_0),
                                                http("request_23")
                                                        .get("/spec/heroez")
                                                        .headers(headers_23),
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
                                                        .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
                                                http("request_31")
                                                        .get("/assets/img/service/man-placeholder.jpg")
                                                        .headers(headers_0),
                                                http("request_32")
                                                        .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                                http("request_33")
                                                        .get("/assets/img/logos/certificate-footer.svg")
                                                        .headers(headers_0),
                                                http("request_34")
                                                        .get("/assets/js/front/glightbox.min.js")
                                                        .headers(headers_4),
                                                http("request_35")
                                                        .get("/assets/js/front/lazy-jquery.min.js")
                                                        .headers(headers_4),
                                                http("request_36")
                                                        .get("/assets/js/front/lightbox.js")
                                                        .headers(headers_4),
                                                http("request_37")
                                                        .get("/assets/js/front/lazy.js")
                                                        .headers(headers_4),
//                                                http("request_38")
//                                                        .get(uri1 + "/metrika/tag.js")
//                                                        .headers(headers_0),
                                                http("request_39")
                                                        .get("/assets/js/front/cookies.js")
                                                        .headers(headers_4),
                                                http("request_40")
                                                        .get("/assets/js/front/header.js")
                                                        .headers(headers_4),
                                                http("request_41")
                                                        .get("/storage/heroez/small/geroiz_103_abakumov.jpeg")
                                                        .headers(headers_0),
                                                http("request_42")
                                                        .get("/storage/heroez/small/geroiz_681_abachev.jpeg")
                                                        .headers(headers_0),
                                                http("request_43")
                                                        .get("/storage/heroez/small/geroiz_537_abdullaev.jpeg")
                                                        .headers(headers_0),
                                                http("request_44")
                                                        .get("/storage/heroez/small/geroiz_290_abramov.jpeg")
                                                        .headers(headers_0),
                                                http("request_45")
                                                        .get("/storage/heroez/small/geroiz_317_abramov.jpeg")
                                                        .headers(headers_0),
                                                http("request_46")
                                                        .get("/storage/heroez/small/geroiz_411_abramov-.jpeg")
                                                        .headers(headers_0),
                                                http("request_47")
                                                        .get("/storage/heroez/small/geroiz_538_agabalaev.jpeg")
                                                        .headers(headers_0),
                                                http("request_48")
                                                        .get("/storage/heroez/small/geroiz_539_agasiev.jpeg")
                                                        .headers(headers_0),
                                                http("request_49")
                                                        .get("/static/favicon.ico")
                                                        .headers(headers_0),
                                                http("request_50")
                                                        .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Fheroez&page-ref=https%3A%2F%2Fasafov.ru%2Fspec%2Fstrategy&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A381776706%3Az%3A300%3Ai%3A20240826204605%3Aet%3A1724687166%3Ac%3A1%3Arn%3A999319620%3Arqn%3A96%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A374%3Awv%3A2%3Ads%3A0%2C0%2C118%2C64%2C1%2C0%2C%2C262%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724687165142%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724687166%3At%3A%D0%93%D0%B5%D1%80%D0%BE%D0%B8%20Z%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                        .headers(headers_50)
//                                                http("request_51")
//                                                        .get(uri1 + "/metrika/metrika_match.html")
//                                                        .headers(headers_51)
                                        )
                        )
                        .exec(
                                http("request_52")
                                        .get("/storage/heroez/small/geroiz_412_agafonov-.jpeg")
                                        .headers(headersAS14_52)
                                        .resources(
                                                http("request_53")
                                                        .get("/storage/heroez/small/geroiz_540_agafonov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_54")
                                                        .get("/storage/heroez/small/geroiz_104_akimov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_55")
                                                        .get("/storage/heroez/small/geroiz_541_adamov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_56")
                                                        .get("/storage/heroez/small/geroiz_413_aksenov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_57")
                                                        .get("/storage/heroez/small/geroiz_329_akulin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_58")
                                                        .get("/storage/heroez/small/geroiz_230_akulov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_59")
                                                        .get("/storage/heroez/small/geroiz_414_alagashev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_60")
                                                        .get("/storage/heroez/small/geroiz_415_alankin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_61")
                                                        .get("/storage/heroez/small/geroiz_025_aleksa.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_62")
                                                        .get("/storage/heroez/small/geroiz_241_aleksandrov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_63")
                                                        .get("/storage/heroez/small/geroiz_408_aleksandrov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_64")
                                                        .get("/storage/heroez/small/geroiz_416_aleksandrov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_65")
                                                        .get("/storage/heroez/small/geroiz_198_alekseev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_66")
                                                        .get("/storage/heroez/small/geroiz_542_alekseev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_67")
                                                        .get("/storage/heroez/small/geroiz_238_alenin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_68")
                                                        .get("/storage/heroez/small/geroiz_417_alehin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_69")
                                                        .get("/storage/heroez/small/geroiz_409_aliev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_70")
                                                        .get("/storage/heroez/small/geroiz_410_alimasov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_71")
                                                        .get("/storage/heroez/small/geroiz_122_alimuradov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_72")
                                                        .get("/storage/heroez/small/geroiz_425_alifatov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_73")
                                                        .get("/storage/heroez/small/geroiz_430_alihov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_74")
                                                        .get("/storage/heroez/small/geroiz_431_amagzaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_75")
                                                        .get("/storage/heroez/small/geroiz_434_amehin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_76")
                                                        .get("/storage/heroez/small/geroiz_244_antipev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_77")
                                                        .get("/storage/heroez/small/geroiz_046_anfalov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_78")
                                                        .get("/storage/heroez/small/geroiz_435_appaev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_79")
                                                        .get("/storage/heroez/small/geroiz_320_antonov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_80")
                                                        .get("/storage/heroez/small/geroiz_194_asaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_81")
                                                        .get("/storage/heroez/small/geroiz_436_askarov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_82")
                                                        .get("/storage/heroez/small/geroiz_153_artemov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_83")
                                                        .get("/storage/heroez/small/geroiz_166_arhipov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_84")
                                                        .get("/storage/heroez/small/geroiz_377_artyunin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_85")
                                                        .get("/storage/heroez/small/geroiz_216_arefev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_86")
                                                        .get("/storage/heroez/small/geroiz_339_askerov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_87")
                                                        .get("/storage/heroez/small/geroiz_051_afanasenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_88")
                                                        .get("/storage/heroez/small/geroiz_176_ahmedov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_89")
                                                        .get("/storage/heroez/small/geroiz_437_ahtyrskij-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_90")
                                                        .get("/storage/heroez/small/geroiz_418_babkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_91")
                                                        .get("/storage/heroez/small/geroiz_297_bagrov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_92")
                                                        .get("/storage/heroez/small/geroiz_419_badluev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_93")
                                                        .get("/storage/heroez/small/geroiz_420_bajgabulov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_94")
                                                        .get("/storage/heroez/small/geroiz_321_bajkara.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_95")
                                                        .get("/storage/heroez/small/geroiz_421_bajmatov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_96")
                                                        .get("/storage/heroez/small/geroiz_422_balabanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_97")
                                                        .get("/storage/heroez/small/geroiz_228_balzhinimaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_98")
                                                        .get("/storage/heroez/small/geroiz_186_balaganskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_99")
                                                        .get("/storage/heroez/small/geroiz_063-bajrambekov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_100")
                                                        .get("/storage/heroez/small/geroiz_030_baluhta.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_101")
                                                        .get("/storage/heroez/small/geroiz_347_balchunas.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_102")
                                                        .get("/storage/heroez/small/geroiz_424_batorov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_103")
                                                        .get("/storage/heroez/small/geroiz_074-barnych.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_104")
                                                        .get("/storage/heroez/small/geroiz_423_barahtin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_105")
                                                        .get("/storage/heroez/small/geroiz_438_bahanov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_106")
                                                        .get("/storage/heroez/small/geroiz_661_bashirov-magomed.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_107")
                                                        .get("/storage/heroez/small/geroiz_439_bacherikov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_108")
                                                        .get("/storage/heroez/small/geroiz_440_bashinskij-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_109")
                                                        .get("/storage/heroez/small/geroiz_660_bashirov-rustam.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_110")
                                                        .get("/storage/heroez/small/geroiz_407_bashkatov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_111")
                                                        .get("/storage/heroez/small/geroiz_433_beloglazov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_112")
                                                        .get("/storage/heroez/small/geroiz_368_bedrin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_113")
                                                        .get("/storage/heroez/small/geroiz_432_bashkirev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_114")
                                                        .get("/storage/heroez/small/geroiz_670_beloglazov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_115")
                                                        .get("/storage/heroez/small/geroiz_036_belousov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_116")
                                                        .get("/storage/heroez/small/geroiz_441_belomyczev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_117")
                                                        .get("/storage/heroez/small/geroiz_240_bervinov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_118")
                                                        .get("/storage/heroez/small/geroiz_449_belyaev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_119")
                                                        .get("/storage/heroez/small/geroiz_448_bender-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_120")
                                                        .get("/storage/heroez/small/geroiz_450_berdihin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_121")
                                                        .get("/storage/heroez/small/geroiz_451_beryoza-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_122")
                                                        .get("/storage/heroez/small/geroiz_009_berngard.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_123")
                                                        .get("/storage/heroez/small/geroiz_452_billo.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_124")
                                                        .get("/storage/heroez/small/geroiz_365_bovkun-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_125")
                                                        .get("/storage/heroez/small/geroiz_391_bogatyrev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_126")
                                                        .get("/storage/heroez/small/geroiz_020_boldyrev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_127")
                                                        .get("/storage/heroez/small/geroiz_324_bolshakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_128")
                                                        .get("/storage/heroez/small/geroiz_344_boyarkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_129")
                                                        .get("/storage/heroez/small/geroiz_096-borisov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_130")
                                                        .get("/storage/heroez/small/geroiz_284_bochkarev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_131")
                                                        .get("/storage/heroez/small/geroiz_369_bormotov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_132")
                                                        .get("/storage/heroez/small/geroiz_323_boyarshin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_133")
                                                        .get("/storage/heroez/small/geroiz_086-brikulskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_134")
                                                        .get("/storage/heroez/small/geroiz_309_kirill-burkovczev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_135")
                                                        .get("/storage/heroez/small/geroiz_671_burczev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_136")
                                                        .get("/storage/heroez/small/geroiz_246_butolin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_137")
                                                        .get("/storage/heroez/small/geroiz_463_buhanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_138")
                                                        .get("/storage/heroez/small/geroiz_128_bystrik.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_139")
                                                        .get("/storage/heroez/small/geroiz_163_buharov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_140")
                                                        .get("/storage/heroez/small/geroiz_464_bylkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_141")
                                                        .get("/storage/heroez/small/geroiz_098-byalik.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_142")
                                                        .get("/storage/heroez/small/geroiz_271_vanchugov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_143")
                                                        .get("/storage/heroez/small/geroiz_382_valeev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_144")
                                                        .get("/storage/heroez/small/geroiz_465_vagner.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_145")
                                                        .get("/storage/heroez/small/geroiz_388_vanchugov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_146")
                                                        .get("/storage/heroez/small/geroiz_219_varushkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_147")
                                                        .get("/storage/heroez/small/geroiz_331_vasilev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_148")
                                                        .get("/storage/heroez/small/geroiz_275_vatrusenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_149")
                                                        .get("/storage/heroez/small/geroiz_024_velichko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_150")
                                                        .get("/storage/heroez/small/geroiz_373_vasilev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_151")
                                                        .get("/storage/heroez/small/geroiz_672_venczkus.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_152")
                                                        .get("/storage/heroez/small/geroiz_268_verhushkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_153")
                                                        .get("/storage/heroez/small/geroiz_466_viznovich.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_154")
                                                        .get("/storage/heroez/small/geroiz_159_vizulajnen.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_155")
                                                        .get("/storage/heroez/small/geroiz_390_vinogradov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_156")
                                                        .get("/storage/heroez/small/geroiz_467_vinogradov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_157")
                                                        .get("/storage/heroez/small/geroiz_468_vladimirov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_158")
                                                        .get("/storage/heroez/small/geroiz_469_vladimirov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_159")
                                                        .get("/storage/heroez/small/geroiz_673_vlasenko-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_160")
                                                        .get("/storage/heroez/small/geroiz_004_vodyanoj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_161")
                                                        .get("/storage/heroez/small/geroiz_379_vojnov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_162")
                                                        .get("/storage/heroez/small/geroiz_018_volkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_163")
                                                        .get("/storage/heroez/small/geroiz_289_volkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_164")
                                                        .get("/storage/heroez/small/geroiz_426_vorotnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_165")
                                                        .get("/storage/heroez/small/geroiz_079-voshkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_166")
                                                        .get("/storage/heroez/small/geroiz_179_vshivkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_167")
                                                        .get("/storage/heroez/small/geroiz_427_vysoczkij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_168")
                                                        .get("/storage/heroez/small/geroiz_173_gabdrahmanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_169")
                                                        .get("/storage/heroez/small/geroiz_345_gabov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_170")
                                                        .get("/storage/heroez/small/geroiz_095-gavrikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_171")
                                                        .get("/storage/heroez/small/geroiz_428_gavrikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_172")
                                                        .get("/storage/heroez/small/geroiz_470_gavro.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_173")
                                                        .get("/storage/heroez/small/geroiz_160_gadaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_174")
                                                        .get("/storage/heroez/small/geroiz_429_gavrilov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_175")
                                                        .get("/storage/heroez/small/geroiz_062-gapchenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_176")
                                                        .get("/storage/heroez/small/geroiz_396_gazdovich.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_177")
                                                        .get("/storage/heroez/small/geroiz_013_gadzhimagomedov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_178")
                                                        .get("/storage/heroez/small/geroiz_117_garbuz.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_179")
                                                        .get("/storage/heroez/small/geroiz_272_garanin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_180")
                                                        .get("/storage/heroez/small/geroiz_027_gasparyan.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_181")
                                                        .get("/storage/heroez/small/geroiz_251_gasymov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_182")
                                                        .get("/storage/heroez/small/geroiz_471_gafurov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_183")
                                                        .get("/storage/heroez/small/geroiz_472_getman.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_184")
                                                        .get("/storage/heroez/small/geroiz_325_gershen.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_185")
                                                        .get("/storage/heroez/small/geroiz_115_gilev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_186")
                                                        .get("/storage/heroez/small/geroiz_233_gladkih.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_187")
                                                        .get("/storage/heroez/small/geroiz_689_glebko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_188")
                                                        .get("/storage/heroez/small/geroiz_188_gladskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_189")
                                                        .get("/storage/heroez/small/geroiz_473_glinka.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_190")
                                                        .get("/storage/heroez/small/geroiz_035_golovko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_191")
                                                        .get("/storage/heroez/small/geroiz_474_golovko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_192")
                                                        .get("/storage/heroez/small/geroiz_109_golubev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_193")
                                                        .get("/storage/heroez/small/geroiz_353_goncharov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_194")
                                                        .get("/storage/heroez/small/geroiz_374_golubchikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_195")
                                                        .get("/storage/heroez/small/geroiz_305_gorbachuk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_196")
                                                        .get("/storage/heroez/small/geroiz_475_gorbunov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_197")
                                                        .get("/storage/heroez/small/geroiz_476_gordievskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_198")
                                                        .get("/storage/heroez/small/geroiz_477_gordienko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_199")
                                                        .get("/storage/heroez/small/geroiz_694_gordovskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_200")
                                                        .get("/storage/heroez/small/geroiz_478_gorohov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_201")
                                                        .get("/storage/heroez/small/geroiz_479_gosse.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_202")
                                                        .get("/storage/heroez/small/geroiz_270_gostyuhin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_203")
                                                        .get("/storage/heroez/small/geroiz_480_gramozdin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_204")
                                                        .get("/storage/heroez/small/geroiz_236_grafkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_205")
                                                        .get("/storage/heroez/small/geroiz_481_grigorev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_206")
                                                        .get("/storage/heroez/small/geroiz_482_grigoryan.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_207")
                                                        .get("/storage/heroez/small/geroiz_081-grishakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_208")
                                                        .get("/storage/heroez/small/geroiz_031_grishin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_209")
                                                        .get("/storage/heroez/small/geroiz_299_gubanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_210")
                                                        .get("/storage/heroez/small/geroiz_028_gubarev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_211")
                                                        .get("/storage/heroez/small/geroiz_483_gubarev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_212")
                                                        .get("/storage/heroez/small/geroiz_484_gugalo.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_213")
                                                        .get("/storage/heroez/small/geroiz_202_gudkov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_214")
                                                        .get("/storage/heroez/small/geroiz_485_gulyandro.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_215")
                                                        .get("/storage/heroez/small/geroiz_318_gubar.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_216")
                                                        .get("/storage/heroez/small/geroiz_690_gunko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_217")
                                                        .get("/storage/heroez/small/geroiz_136_guralev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_218")
                                                        .get("/storage/heroez/small/geroiz_260_danyarov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_219")
                                                        .get("/storage/heroez/small/geroiz_376_devushkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_220")
                                                        .get("/storage/heroez/small/geroiz_033_gushherev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_221")
                                                        .get("/storage/heroez/small/geroiz_206_davydov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_222")
                                                        .get("/storage/heroez/small/geroiz_088-devyatov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_223")
                                                        .get("/storage/heroez/small/geroiz_070-demidov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_224")
                                                        .get("/storage/heroez/small/geroiz_486_deev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_225")
                                                        .get("/storage/heroez/small/geroiz_161_demurchiev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_226")
                                                        .get("/storage/heroez/small/geroiz_359_denisov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_227")
                                                        .get("/storage/heroez/small/geroiz_487_detter.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_228")
                                                        .get("/storage/heroez/small/geroiz_141_dehtyar.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_229")
                                                        .get("/storage/heroez/small/geroiz_395_dehtyar-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_230")
                                                        .get("/storage/heroez/small/geroiz_210_dzhamaldinov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_231")
                                                        .get("/storage/heroez/small/geroiz_598_dzhamaludin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_232")
                                                        .get("/storage/heroez/small/geroiz_189_dzhioev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_233")
                                                        .get("/storage/heroez/small/geroiz_316_dzhumagaliev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_234")
                                                        .get("/storage/heroez/small/geroiz_488_digoev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_235")
                                                        .get("/storage/heroez/small/geroiz_392_didenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_236")
                                                        .get("/storage/heroez/small/geroiz_021_dmitruk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_237")
                                                        .get("/storage/heroez/small/geroiz_333_domozhilkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_238")
                                                        .get("/storage/heroez/small/geroiz_691_domrachev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_239")
                                                        .get("/storage/heroez/small/geroiz_337_dongak-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_240")
                                                        .get("/storage/heroez/small/geroiz_491_dorofeev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_241")
                                                        .get("/storage/heroez/small/geroiz_492_dorohov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_242")
                                                        .get("/storage/heroez/small/geroiz_493_dorohov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_243")
                                                        .get("/storage/heroez/small/geroiz_048_dremlyuga.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_244")
                                                        .get("/storage/heroez/small/geroiz_494_drobin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_245")
                                                        .get("/storage/heroez/small/geroiz_495_drozdov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_246")
                                                        .get("/storage/heroez/small/geroiz_015_dudin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_247")
                                                        .get("/storage/heroez/small/geroiz_399_evseev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_248")
                                                        .get("/storage/heroez/small/geroiz_129_egorov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_249")
                                                        .get("/storage/heroez/small/geroiz_442_egorov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_250")
                                                        .get("/storage/heroez/small/geroiz_443_endoviczkij-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_251")
                                                        .get("/storage/heroez/small/geroiz_350_ermolin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_252")
                                                        .get("/storage/heroez/small/geroiz_144_ershov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_253")
                                                        .get("/storage/heroez/small/geroiz_444_zhalybin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_254")
                                                        .get("/storage/heroez/small/geroiz_692_zhantiev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_255")
                                                        .get("/storage/heroez/small/geroiz_445_zhapov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_256")
                                                        .get("/storage/heroez/small/geroiz_446_zharenov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_257")
                                                        .get("/storage/heroez/small/geroiz_447_zharehin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_258")
                                                        .get("/storage/heroez/small/geroiz_258_zharkih.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_259")
                                                        .get("/storage/heroez/small/geroiz_496_zharskoj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_260")
                                                        .get("/storage/heroez/small/geroiz_497_zhdanenya.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_261")
                                                        .get("/storage/heroez/small/geroiz_498_zhmakin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_262")
                                                        .get("/storage/heroez/small/geroiz_125_zheludkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_263")
                                                        .get("/storage/heroez/small/geroiz_140_zhukov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_264")
                                                        .get("/storage/heroez/small/geroiz_150_zhukov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_265")
                                                        .get("/storage/heroez/small/geroiz_693_zhukov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_266")
                                                        .get("/storage/heroez/small/geroiz_269_zhusupov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_267")
                                                        .get("/storage/heroez/small/geroiz_006_zhusupov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_268")
                                                        .get("/storage/heroez/small/geroiz_501_zadvornyj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_269")
                                                        .get("/storage/heroez/small/geroiz_499_zabegajlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_270")
                                                        .get("/storage/heroez/small/geroiz_500_zabotin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_271")
                                                        .get("/storage/heroez/small/geroiz_502_zaigraev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_272")
                                                        .get("/storage/heroez/small/geroiz_461_zajnulin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_273")
                                                        .get("/storage/heroez/small/geroiz_489_zajczev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_274")
                                                        .get("/storage/heroez/small/geroiz_490_zanaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_275")
                                                        .get("/storage/heroez/small/geroiz_503_zaripov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_276")
                                                        .get("/storage/heroez/small/geroiz_504_zverev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_277")
                                                        .get("/storage/heroez/small/geroiz_505_zvyagin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_278")
                                                        .get("/storage/heroez/small/geroiz_132_zelenov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_279")
                                                        .get("/storage/heroez/small/geroiz_087-zelenskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_280")
                                                        .get("/storage/heroez/small/geroiz_134_zoteev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_281")
                                                        .get("/storage/heroez/small/geroiz_085-zubecz.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_282")
                                                        .get("/storage/heroez/small/geroiz_506_zubkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_283")
                                                        .get("/storage/heroez/small/geroiz_307_zubov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_284")
                                                        .get("/storage/heroez/small/geroiz_047_ibragimov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_285")
                                                        .get("/storage/heroez/small/geroiz_335_ivankin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_286")
                                                        .get("/storage/heroez/small/geroiz_310_mihail-ivannikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_287")
                                                        .get("/storage/heroez/small/geroiz_319_ivanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_288")
                                                        .get("/storage/heroez/small/geroiz_393_ivanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_289")
                                                        .get("/storage/heroez/small/geroiz_507_ivanivanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_290")
                                                        .get("/storage/heroez/small/geroiz_508_najdanivanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_291")
                                                        .get("/storage/heroez/small/geroiz_003_ivanova.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_292")
                                                        .get("/storage/heroez/small/geroiz_327_ignatev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_293")
                                                        .get("/storage/heroez/small/geroiz_267_ivshin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_294")
                                                        .get("/storage/heroez/small/geroiz_509_idilov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_295")
                                                        .get("/storage/heroez/small/geroiz_162_ilyazov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_296")
                                                        .get("/storage/heroez/small/geroiz_348_imangulov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_297")
                                                        .get("/storage/heroez/small/geroiz_510_iryanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_298")
                                                        .get("/storage/heroez/small/geroiz_511_iusov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_299")
                                                        .get("/storage/heroez/small/geroiz_118_kabaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_300")
                                                        .get("/storage/heroez/small/geroiz_211_juldoshev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_301")
                                                        .get("/storage/heroez/small/geroiz_512_kabanczev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_302")
                                                        .get("/storage/heroez/small/geroiz_513_kabiczkij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_303")
                                                        .get("/storage/heroez/small/geroiz_360_kadyrov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_304")
                                                        .get("/storage/heroez/small/geroiz_514_kazagashev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_305")
                                                        .get("/storage/heroez/small/geroiz_516_aleksejkazakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_306")
                                                        .get("/storage/heroez/small/geroiz_515_antonkazakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_307")
                                                        .get("/storage/heroez/small/geroiz_517_kazarenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_308")
                                                        .get("/storage/heroez/small/geroiz_094-kajmakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_309")
                                                        .get("/storage/heroez/small/geroiz_124_kajtanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_310")
                                                        .get("/storage/heroez/small/geroiz_330_kalachev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_311")
                                                        .get("/storage/heroez/small/geroiz_227_kalashnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_312")
                                                        .get("/storage/heroez/small/geroiz_174_kalimullin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_313")
                                                        .get("/storage/heroez/small/geroiz_518_kalinin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_314")
                                                        .get("/storage/heroez/small/geroiz_287_kalinchenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_315")
                                                        .get("/storage/heroez/small/geroiz_651_kalniczkij-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_316")
                                                        .get("/storage/heroez/small/geroiz_208_kamaletdinov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_317")
                                                        .get("/storage/heroez/small/geroiz_652_kamnev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_318")
                                                        .get("/storage/heroez/small/geroiz_054-kapustin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_319")
                                                        .get("/storage/heroez/small/geroiz_653_kara-sal.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_320")
                                                        .get("/storage/heroez/small/geroiz_207_karakaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_321")
                                                        .get("/storage/heroez/small/geroiz_135_karnaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_322")
                                                        .get("/storage/heroez/small/geroiz_654_kartashova-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_323")
                                                        .get("/storage/heroez/small/geroiz_519_kartin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_324")
                                                        .get("/storage/heroez/small/geroiz_520_karymbaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_325")
                                                        .get("/storage/heroez/small/geroiz_037_kasenov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_326")
                                                        .get("/storage/heroez/small/geroiz_521_kaspruk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_327")
                                                        .get("/storage/heroez/small/geroiz_192_kaurdakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_328")
                                                        .get("/storage/heroez/small/geroiz_522_kafiyatullov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_329")
                                                        .get("/storage/heroez/small/geroiz_655_kashkurova.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_330")
                                                        .get("/storage/heroez/small/geroiz_185_kashtakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_331")
                                                        .get("/storage/heroez/small/geroiz_292_kilmuhametov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_332")
                                                        .get("/storage/heroez/small/geroiz_523_kleshnin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_333")
                                                        .get("/storage/heroez/small/geroiz_361_klemis.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_334")
                                                        .get("/storage/heroez/small/geroiz_262_kishkanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_335")
                                                        .get("/storage/heroez/small/geroiz_524_klimenkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_336")
                                                        .get("/storage/heroez/small/geroiz_354_klyukin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_337")
                                                        .get("/storage/heroez/small/geroiz_525_klopovskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_338")
                                                        .get("/storage/heroez/small/geroiz_029_klyushnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_339")
                                                        .get("/storage/heroez/small/geroiz_385_kovalenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_340")
                                                        .get("/storage/heroez/small/geroiz_110_kozin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_341")
                                                        .get("/storage/heroez/small/geroiz_017_kozlovczev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_342")
                                                        .get("/storage/heroez/small/geroiz_231_koznov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_343")
                                                        .get("/storage/heroez/small/geroiz_526_kolesnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_344")
                                                        .get("/storage/heroez/small/geroiz_049_kolesnichenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_345")
                                                        .get("/storage/heroez/small/geroiz_155_kolomenskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_346")
                                                        .get("/storage/heroez/small/geroiz_281_komarov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_347")
                                                        .get("/storage/heroez/small/geroiz_527_kondratev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_348")
                                                        .get("/storage/heroez/small/geroiz_528_kondrashev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_349")
                                                        .get("/storage/heroez/small/geroiz_151_konovalenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_350")
                                                        .get("/storage/heroez/small/geroiz_105_korneev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_351")
                                                        .get("/storage/heroez/small/geroiz_311_dmitrij-korobejnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_352")
                                                        .get("/storage/heroez/small/geroiz_066-korobov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_353")
                                                        .get("/storage/heroez/small/geroiz_529_korotaev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_354")
                                                        .get("/storage/heroez/small/geroiz_356_korshikov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_355")
                                                        .get("/storage/heroez/small/geroiz_242_koryakin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_356")
                                                        .get("/storage/heroez/small/geroiz_401_kostin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_357")
                                                        .get("/storage/heroez/small/geroiz_530_kosyug-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_358")
                                                        .get("/storage/heroez/small/geroiz_072-kotov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_359")
                                                        .get("/storage/heroez/small/geroiz_076-kochengin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_360")
                                                        .get("/storage/heroez/small/geroiz_576_kochkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_361")
                                                        .get("/storage/heroez/small/geroiz_577_koshheenkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_362")
                                                        .get("/storage/heroez/small/geroiz_659_kravczov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_363")
                                                        .get("/storage/heroez/small/geroiz_099-krasnov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_364")
                                                        .get("/storage/heroez/small/geroiz_247_krasnyuk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_365")
                                                        .get("/storage/heroez/small/geroiz_578_kriniczin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_366")
                                                        .get("/storage/heroez/small/geroiz_182_krylov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_367")
                                                        .get("/storage/heroez/small/geroiz_273_krylov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_368")
                                                        .get("/storage/heroez/small/geroiz_183_kuzakov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_369")
                                                        .get("/storage/heroez/small/geroiz_204_kuzneczov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_370")
                                                        .get("/storage/heroez/small/geroiz_312_bogdan-kuzneczov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_371")
                                                        .get("/storage/heroez/small/geroiz_145_kuzmin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_372")
                                                        .get("/storage/heroez/small/geroiz_579_kuzminczev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_373")
                                                        .get("/storage/heroez/small/geroiz_142_kulaga.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_374")
                                                        .get("/storage/heroez/small/geroiz_336_kulyabin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_375")
                                                        .get("/storage/heroez/small/geroiz_133_kuminov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_376")
                                                        .get("/storage/heroez/small/geroiz_243_kurbanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_377")
                                                        .get("/storage/heroez/small/geroiz_580_kuczenko-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_378")
                                                        .get("/storage/heroez/small/geroiz_657_kurushin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_379")
                                                        .get("/storage/heroez/small/geroiz_658_kydyrbaev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_380")
                                                        .get("/storage/heroez/small/geroiz_341_kyrgys.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_381")
                                                        .get("/storage/heroez/small/geroiz_581_kyalunziga-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_382")
                                                        .get("/storage/heroez/small/geroiz_582_lazarev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_383")
                                                        .get("/storage/heroez/small/geroiz_386_laktionov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_384")
                                                        .get("/storage/heroez/small/geroiz_111_lalla.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_385")
                                                        .get("/storage/heroez/small/geroiz_068-lebedev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_386")
                                                        .get("/storage/heroez/small/geroiz_126_lebedev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_387")
                                                        .get("/storage/heroez/small/geroiz_355_lebedev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_388")
                                                        .get("/storage/heroez/small/geroiz_152_levin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_389")
                                                        .get("/storage/heroez/small/geroiz_001_levkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_390")
                                                        .get("/storage/heroez/small/geroiz_012_levkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_391")
                                                        .get("/storage/heroez/small/geroiz_039_leuhin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_392")
                                                        .get("/storage/heroez/small/geroiz_569_ligostaev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_393")
                                                        .get("/storage/heroez/small/geroiz_334_lipatov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_394")
                                                        .get("/storage/heroez/small/geroiz_285_lipchenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_395")
                                                        .get("/storage/heroez/small/geroiz_570_lisovenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_396")
                                                        .get("/storage/heroez/small/geroiz_067-litvinenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_397")
                                                        .get("/storage/heroez/small/geroiz_011_litvinov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_398")
                                                        .get("/storage/heroez/small/geroiz_340_lobanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_399")
                                                        .get("/storage/heroez/small/geroiz_571_loginov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_400")
                                                        .get("/storage/heroez/small/geroiz_380_lozhevich.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_401")
                                                        .get("/storage/heroez/small/geroiz_572_lomotkin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_402")
                                                        .get("/storage/heroez/small/geroiz_120_lukin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_403")
                                                        .get("/storage/heroez/small/geroiz_573_lukyanchenko-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_404")
                                                        .get("/storage/heroez/small/geroiz_038_lysenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_405")
                                                        .get("/storage/heroez/small/geroiz_077-lysenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_406")
                                                        .get("/storage/heroez/small/geroiz_574_lysenko-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_407")
                                                        .get("/storage/heroez/small/geroiz_575_lyubarczev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_408")
                                                        .get("/storage/heroez/small/geroiz_146_lyapunov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_409")
                                                        .get("/storage/heroez/small/geroiz_604_lyashov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_410")
                                                        .get("/storage/heroez/small/geroiz_605_makarov-ilya.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_411")
                                                        .get("/storage/heroez/small/geroiz_683_magomedov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_412")
                                                        .get("/storage/heroez/small/geroiz_685_magomedov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_413")
                                                        .get("/storage/heroez/small/geroiz_606_makarov-kirill.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_414")
                                                        .get("/storage/heroez/small/geroiz_093-makoev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_415")
                                                        .get("/storage/heroez/small/geroiz_607_makarov_konstantin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_416")
                                                        .get("/storage/heroez/small/geroiz_608_maksimov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_417")
                                                        .get("/storage/heroez/small/geroiz_609_malyutin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_418")
                                                        .get("/storage/heroez/small/geroiz_403_malchikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_419")
                                                        .get("/storage/heroez/small/geroiz_349_malahov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_420")
                                                        .get("/storage/heroez/small/geroiz_084-manahov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_421")
                                                        .get("/storage/heroez/small/geroiz_080-mamutov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_422")
                                                        .get("/storage/heroez/small/geroiz_101-mansurov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_423")
                                                        .get("/storage/heroez/small/geroiz_378_marin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_424")
                                                        .get("/storage/heroez/small/geroiz_060-markov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_425")
                                                        .get("/storage/heroez/small/geroiz_610_mansurovskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_426")
                                                        .get("/storage/heroez/small/geroiz_237_martirosyan.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_427")
                                                        .get("/storage/heroez/small/geroiz_157_marushkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_428")
                                                        .get("/storage/heroez/small/geroiz_232_martyn.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_429")
                                                        .get("/storage/heroez/small/geroiz_137_marusov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_430")
                                                        .get("/storage/heroez/small/geroiz_635_marfin-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_431")
                                                        .get("/storage/heroez/small/geroiz_636_marchin-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_432")
                                                        .get("/storage/heroez/small/geroiz_358_matkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_433")
                                                        .get("/storage/heroez/small/geroiz_043_matyuk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_434")
                                                        .get("/storage/heroez/small/geroiz_016_matyushkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_435")
                                                        .get("/storage/heroez/small/geroiz_637_medvedev-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_436")
                                                        .get("/storage/heroez/small/geroiz_638_melihov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_437")
                                                        .get("/storage/heroez/small/geroiz_639_menshaev-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_438")
                                                        .get("/storage/heroez/small/geroiz_261_merzhoev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_439")
                                                        .get("/storage/heroez/small/geroiz_640_merzlikin-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_440")
                                                        .get("/storage/heroez/small/geroiz_620_merkulov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_441")
                                                        .get("/storage/heroez/small/geroiz_220_mesyaczev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_442")
                                                        .get("/storage/heroez/small/geroiz_621_minaev-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_443")
                                                        .get("/storage/heroez/small/geroiz_622_minosyan-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_444")
                                                        .get("/storage/heroez/small/geroiz_623_mirzoev-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_445")
                                                        .get("/storage/heroez/small/geroiz_112_miroshnichenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_446")
                                                        .get("/storage/heroez/small/geroiz_282_mihajlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_447")
                                                        .get("/storage/heroez/small/geroiz_053-mihajlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_448")
                                                        .get("/storage/heroez/small/geroiz_286_mityashin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_449")
                                                        .get("/storage/heroez/small/geroiz_298_mihajlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_450")
                                                        .get("/storage/heroez/small/geroiz_225_mihalskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_451")
                                                        .get("/storage/heroez/small/geroiz_313_aleksandr-mihajlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_452")
                                                        .get("/storage/heroez/small/geroiz_032_mihajlus.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_453")
                                                        .get("/storage/heroez/small/geroiz_071-moloshnyak.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_454")
                                                        .get("/storage/heroez/small/geroiz_113_munkuev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_455")
                                                        .get("/storage/heroez/small/geroiz_625_muntyancz-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_456")
                                                        .get("/storage/heroez/small/geroiz_040_morgunov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_457")
                                                        .get("/storage/heroez/small/geroiz_624_mongush-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_458")
                                                        .get("/storage/heroez/small/geroiz_629_nefedov-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_459")
                                                        .get("/storage/heroez/small/geroiz_628_nahtarmin-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_460")
                                                        .get("/storage/heroez/small/geroiz_254_nehozhin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_461")
                                                        .get("/storage/heroez/small/geroiz_627_naumov-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_462")
                                                        .get("/storage/heroez/small/geroiz_274_nepomnyashhih.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_463")
                                                        .get("/storage/heroez/small/geroiz_222_nasonov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_464")
                                                        .get("/storage/heroez/small/geroiz_630_nechepurenko-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_465")
                                                        .get("/storage/heroez/small/geroiz_302_nikitin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_466")
                                                        .get("/storage/heroez/small/geroiz_221_nikiforov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_467")
                                                        .get("/storage/heroez/small/geroiz_402_nikiforov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_468")
                                                        .get("/storage/heroez/small/geroiz_631_nikiforov-vladislav-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_469")
                                                        .get("/storage/heroez/small/geroiz_632_nikiforov-sergej-1-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_470")
                                                        .get("/storage/heroez/small/geroiz_363_nikulin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_471")
                                                        .get("/storage/heroez/small/geroiz_014_nimchenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_472")
                                                        .get("/storage/heroez/small/geroiz_371_novikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_473")
                                                        .get("/storage/heroez/small/geroiz_633_novoselov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_474")
                                                        .get("/storage/heroez/small/geroiz_195_ovsyannikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_475")
                                                        .get("/storage/heroez/small/geroiz_249_ovsyannikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_476")
                                                        .get("/storage/heroez/small/geroiz_634_noskov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_477")
                                                        .get("/storage/heroez/small/geroiz_034_ovcharenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_478")
                                                        .get("/storage/heroez/small/geroiz_065-ovchar.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_479")
                                                        .get("/storage/heroez/small/geroiz_400_ovchinnikov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_480")
                                                        .get("/storage/heroez/small/geroiz_218_okorokov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_481")
                                                        .get("/storage/heroez/small/geroiz_200_olkin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_482")
                                                        .get("/storage/heroez/small/geroiz_181_olkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_483")
                                                        .get("/storage/heroez/small/geroiz_082-omurbekov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_484")
                                                        .get("/storage/heroez/small/geroiz_315_oorzhak.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_485")
                                                        .get("/storage/heroez/small/geroiz_346_orlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_486")
                                                        .get("/storage/heroez/small/geroiz_362_oskin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_487")
                                                        .get("/storage/heroez/small/geroiz_280_pavlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_488")
                                                        .get("/storage/heroez/small/geroiz_308_anton-pavlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_489")
                                                        .get("/storage/heroez/small/geroiz_078-pakulov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_490")
                                                        .get("/storage/heroez/small/geroiz_114_pankratov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_491")
                                                        .get("/storage/heroez/small/geroiz_644_panfyorov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_492")
                                                        .get("/storage/heroez/small/geroiz_259_paramonova-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_493")
                                                        .get("/storage/heroez/small/geroiz_007_paskar.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_494")
                                                        .get("/storage/heroez/small/geroiz_229_pastuhov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_495")
                                                        .get("/storage/heroez/small/geroiz_381_pahomkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_496")
                                                        .get("/storage/heroez/small/geroiz_196_pahomov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_497")
                                                        .get("/storage/heroez/small/geroiz_265_penkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_498")
                                                        .get("/storage/heroez/small/geroiz_645_pervuhin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_499")
                                                        .get("/storage/heroez/small/geroiz_646_perevalov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_500")
                                                        .get("/storage/heroez/small/geroiz_647_perevozkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_501")
                                                        .get("/storage/heroez/small/geroiz_648_perelygin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_502")
                                                        .get("/storage/heroez/small/geroiz_057-perepelkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_503")
                                                        .get("/storage/heroez/small/geroiz_649_permyakov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_504")
                                                        .get("/storage/heroez/small/geroiz_641_perov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_505")
                                                        .get("/storage/heroez/small/geroiz_130_persaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_506")
                                                        .get("/storage/heroez/small/geroiz_205_petelin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_507")
                                                        .get("/storage/heroez/small/geroiz_650_petrov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_508")
                                                        .get("/storage/heroez/small/geroiz_642_petrochenko-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_509")
                                                        .get("/storage/heroez/small/geroiz_116_petrunin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_510")
                                                        .get("/storage/heroez/small/geroiz_643_peshkov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_511")
                                                        .get("/storage/heroez/small/geroiz_300_pidgurskaya.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_512")
                                                        .get("/storage/heroez/small/geroiz_064-pisarev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_513")
                                                        .get("/storage/heroez/small/geroiz_366_pismaryov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_514")
                                                        .get("/storage/heroez/small/geroiz_405_platov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_515")
                                                        .get("/storage/heroez/small/geroiz_158_podobedov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_516")
                                                        .get("/storage/heroez/small/geroiz_611_podygalov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_517")
                                                        .get("/storage/heroez/small/geroiz_612_politov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_518")
                                                        .get("/storage/heroez/small/geroiz_613_polozkov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_519")
                                                        .get("/storage/heroez/small/geroiz_148_polyakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_520")
                                                        .get("/storage/heroez/small/geroiz_167_polyakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_521")
                                                        .get("/storage/heroez/small/geroiz_061-popov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_522")
                                                        .get("/storage/heroez/small/geroiz_199_popov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_523")
                                                        .get("/storage/heroez/small/geroiz_614_popov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_524")
                                                        .get("/storage/heroez/small/geroiz_615_posohin-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_525")
                                                        .get("/storage/heroez/small/geroiz_100-postnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_526")
                                                        .get("/storage/heroez/small/geroiz_616_pos-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_527")
                                                        .get("/storage/heroez/small/geroiz_617_potapov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_528")
                                                        .get("/storage/heroez/small/geroiz_106_pochesnyj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_529")
                                                        .get("/storage/heroez/small/geroiz_127_proskurin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_530")
                                                        .get("/storage/heroez/small/geroiz_342_proczenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_531")
                                                        .get("/storage/heroez/small/geroiz_201_prygunov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_532")
                                                        .get("/storage/heroez/small/geroiz_398_pudkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_533")
                                                        .get("/storage/heroez/small/geroiz_175_putilin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_534")
                                                        .get("/storage/heroez/small/geroiz_256_pyhtin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_535")
                                                        .get("/storage/heroez/small/geroiz_618_pyatin-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_536")
                                                        .get("/storage/heroez/small/geroiz_619_rabadanov-1.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_537")
                                                        .get("/storage/heroez/small/geroiz_597_razvalyaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_538")
                                                        .get("/storage/heroez/small/geroiz_599_rasskaz.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_539")
                                                        .get("/storage/heroez/small/geroiz_364_repko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_540")
                                                        .get("/storage/heroez/small/geroiz_679_reshetnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_541")
                                                        .get("/storage/heroez/small/geroiz_680_reshetov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_542")
                                                        .get("/storage/heroez/small/geroiz_250_rogozhnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_543")
                                                        .get("/storage/heroez/small/geroiz_600_rodionov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_544")
                                                        .get("/storage/heroez/small/geroiz_257_romanenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_545")
                                                        .get("/storage/heroez/small/geroiz_278_romanenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_546")
                                                        .get("/storage/heroez/small/geroiz_180_romanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_547")
                                                        .get("/storage/heroez/small/geroiz_357_romanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_548")
                                                        .get("/storage/heroez/small/geroiz_601_romanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_549")
                                                        .get("/storage/heroez/small/geroiz_322_rtishhev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_550")
                                                        .get("/storage/heroez/small/geroiz_367_rudenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_551")
                                                        .get("/storage/heroez/small/geroiz_602_rydvanskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_552")
                                                        .get("/storage/heroez/small/geroiz_301_ryzhkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_553")
                                                        .get("/storage/heroez/small/geroiz_042_sabitov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_554")
                                                        .get("/storage/heroez/small/geroiz_590_savelev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_555")
                                                        .get("/storage/heroez/small/geroiz_603_savelev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_556")
                                                        .get("/storage/heroez/small/geroiz_235_savenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_557")
                                                        .get("/storage/heroez/small/geroiz_591_savrasov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_558")
                                                        .get("/storage/heroez/small/geroiz_168_savchenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_559")
                                                        .get("/storage/heroez/small/geroiz_592_sazonov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_560")
                                                        .get("/storage/heroez/small/geroiz_314_saksonov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_561")
                                                        .get("/storage/heroez/small/geroiz_058-salimhanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_562")
                                                        .get("/storage/heroez/small/geroiz_069-salihov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_563")
                                                        .get("/storage/heroez/small/geroiz_593_salmanskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_564")
                                                        .get("/storage/heroez/small/geroiz_045_salynov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_565")
                                                        .get("/storage/heroez/small/geroiz_594_samohin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_566")
                                                        .get("/storage/heroez/small/geroiz_213_sandu.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_567")
                                                        .get("/storage/heroez/small/geroiz_372_sanigarov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_568")
                                                        .get("/storage/heroez/small/geroiz_595_sankov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_569")
                                                        .get("/storage/heroez/small/geroiz_055_sapegin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_570")
                                                        .get("/storage/heroez/small/geroiz_234_sarbasov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_571")
                                                        .get("/storage/heroez/small/geroiz_596_sat.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_572")
                                                        .get("/storage/heroez/small/geroiz_583_satubaldiev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_573")
                                                        .get("/storage/heroez/small/geroiz_226_saunin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_574")
                                                        .get("/storage/heroez/small/geroiz_306_sedegov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_575")
                                                        .get("/storage/heroez/small/geroiz_584_seliverstov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_576")
                                                        .get("/storage/heroez/small/geroiz_193_sigulin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_577")
                                                        .get("/storage/heroez/small/geroiz_585_sizov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_578")
                                                        .get("/storage/heroez/small/geroiz_586_siniczyn-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_579")
                                                        .get("/storage/heroez/small/geroiz_022_siplivyj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_580")
                                                        .get("/storage/heroez/small/geroiz_283_skachkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_581")
                                                        .get("/storage/heroez/small/geroiz_406_skovorodeczkij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_582")
                                                        .get("/storage/heroez/small/geroiz_177_skorodinskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_583")
                                                        .get("/storage/heroez/small/geroiz_587_skrynnik.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_584")
                                                        .get("/storage/heroez/small/geroiz_588_skulkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_585")
                                                        .get("/storage/heroez/small/geroiz_138_slizko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_586")
                                                        .get("/storage/heroez/small/geroiz_303_smirnov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_587")
                                                        .get("/storage/heroez/small/geroiz_351_smirnov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_588")
                                                        .get("/storage/heroez/small/geroiz_589_smirnov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_589")
                                                        .get("/storage/heroez/small/geroiz_008_smolnikov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_590")
                                                        .get("/storage/heroez/small/geroiz_090-sokolov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_591")
                                                        .get("/storage/heroez/small/geroiz_566_sokolov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_592")
                                                        .get("/storage/heroez/small/geroiz_567_soktoev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_593")
                                                        .get("/storage/heroez/small/geroiz_209_solovev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_594")
                                                        .get("/storage/heroez/small/geroiz_554_solovev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_595")
                                                        .get("/storage/heroez/small/geroiz_568_solovev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_596")
                                                        .get("/storage/heroez/small/geroiz_178_solopov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_597")
                                                        .get("/storage/heroez/small/geroiz_252_soplyakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_598")
                                                        .get("/storage/heroez/small/geroiz_304_sosnin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_599")
                                                        .get("/storage/heroez/small/geroiz_352_soshnev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_600")
                                                        .get("/storage/heroez/small/geroiz_555_starodubov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_601")
                                                        .get("/storage/heroez/small/geroiz_002_starostin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_602")
                                                        .get("/storage/heroez/small/geroiz_052-stepanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_603")
                                                        .get("/storage/heroez/small/geroiz_214_stepanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_604")
                                                        .get("/storage/heroez/small/geroiz_224_stolyarov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_605")
                                                        .get("/storage/heroez/small/geroiz_556_strogov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_606")
                                                        .get("/storage/heroez/small/geroiz_156_struev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_607")
                                                        .get("/storage/heroez/small/geroiz_091-suloyanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_608")
                                                        .get("/storage/heroez/small/geroiz_073-sultanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_609")
                                                        .get("/storage/heroez/small/geroiz_677_sunyajkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_610")
                                                        .get("/storage/heroez/small/geroiz_676_sutyagin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_611")
                                                        .get("/storage/heroez/small/geroiz_557_suhochev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_612")
                                                        .get("/storage/heroez/small/geroiz_678_suhochev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_613")
                                                        .get("/storage/heroez/small/geroiz_291_synkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_614")
                                                        .get("/storage/heroez/small/geroiz_328_syrczev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_615")
                                                        .get("/storage/heroez/small/geroiz_279_taov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_616")
                                                        .get("/storage/heroez/small/geroiz_139_taran.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_617")
                                                        .get("/storage/heroez/small/geroiz_558_tatarnikov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_618")
                                                        .get("/storage/heroez/small/geroiz_559_tembotov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_619")
                                                        .get("/storage/heroez/small/geroiz_019_temirhanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_620")
                                                        .get("/storage/heroez/small/geroiz_059-teplyh.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_621")
                                                        .get("/storage/heroez/small/geroiz_560_terehov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_622")
                                                        .get("/storage/heroez/small/geroiz_561_timganov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_623")
                                                        .get("/storage/heroez/small/geroiz_263_tkachev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_624")
                                                        .get("/storage/heroez/small/geroiz_562_tokar.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_625")
                                                        .get("/storage/heroez/small/geroiz_563_tomilov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_626")
                                                        .get("/storage/heroez/small/geroiz_404_topchiev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_627")
                                                        .get("/storage/heroez/small/geroiz_170_torsunov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_628")
                                                        .get("/storage/heroez/small/geroiz_097-tochilkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_629")
                                                        .get("/storage/heroez/small/geroiz_041_trigub.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_630")
                                                        .get("/storage/heroez/small/geroiz_564_tugushev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_631")
                                                        .get("/storage/heroez/small/geroiz_565_tyryshkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_632")
                                                        .get("/storage/heroez/small/geroiz_543_tyuterev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_633")
                                                        .get("/storage/heroez/small/geroiz_544_tyapkin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_634")
                                                        .get("/storage/heroez/small/geroiz_121_umarhadzhiev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_635")
                                                        .get("/storage/heroez/small/geroiz_023_urunov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_636")
                                                        .get("/storage/heroez/small/geroiz_190_us.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_637")
                                                        .get("/storage/heroez/small/geroiz_184_usmanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_638")
                                                        .get("/storage/heroez/small/geroiz_343_usov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_639")
                                                        .get("/storage/heroez/small/geroiz_545_ushakov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_640")
                                                        .get("/storage/heroez/small/geroiz_212_fadeev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_641")
                                                        .get("/storage/heroez/small/geroiz_172_fedas.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_642")
                                                        .get("/storage/heroez/small/geroiz_149_fedotkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_643")
                                                        .get("/storage/heroez/small/geroiz_253_fedotov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_644")
                                                        .get("/storage/heroez/small/geroiz_546_filonov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_645")
                                                        .get("/storage/heroez/small/geroiz_277_fozilov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_646")
                                                        .get("/storage/heroez/small/geroiz_264_fokin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_647")
                                                        .get("/storage/heroez/small/geroiz_154_fomin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_648")
                                                        .get("/storage/heroez/small/geroiz_203_furduj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_649")
                                                        .get("/storage/heroez/small/geroiz_123_hadzhavahidov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_650")
                                                        .get("/storage/heroez/small/geroiz_547_haziev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_651")
                                                        .get("/storage/heroez/small/geroiz_394_halikov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_652")
                                                        .get("/storage/heroez/small/geroiz_384_halturin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_653")
                                                        .get("/storage/heroez/small/geroiz_050_hamitov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_654")
                                                        .get("/storage/heroez/small/geroiz_005_hasanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_655")
                                                        .get("/storage/heroez/small/geroiz_548_hashegulgov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_656")
                                                        .get("/storage/heroez/small/geroiz_164_hismatullin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_657")
                                                        .get("/storage/heroez/small/geroiz_245_hlynovskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_658")
                                                        .get("/storage/heroez/small/geroiz_665_hodachkov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_659")
                                                        .get("/storage/heroez/small/geroiz_666_holodkov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_660")
                                                        .get("/storage/heroez/small/geroiz_131_hohlov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_661")
                                                        .get("/storage/heroez/small/geroiz_549_hudin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_662")
                                                        .get("/storage/heroez/small/geroiz_296_czarenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_663")
                                                        .get("/storage/heroez/small/geroiz_550_czopanov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_664")
                                                        .get("/storage/heroez/small/geroiz_551_czurenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_665")
                                                        .get("/storage/heroez/small/geroiz_552_czydypov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_666")
                                                        .get("/storage/heroez/small/geroiz_293_czyrenzhapov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_667")
                                                        .get("/storage/heroez/small/geroiz_332_chadamba.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_668")
                                                        .get("/storage/heroez/small/geroiz_217_chekulaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_669")
                                                        .get("/storage/heroez/small/geroiz_664_chelczov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_670")
                                                        .get("/storage/heroez/small/geroiz_553_chemyshev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_671")
                                                        .get("/storage/heroez/small/geroiz_532_chepelev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_672")
                                                        .get("/storage/heroez/small/geroiz_370_cherepahin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_673")
                                                        .get("/storage/heroez/small/geroiz_026_chernyj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_674")
                                                        .get("/storage/heroez/small/geroiz_108_chernyshev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_675")
                                                        .get("/storage/heroez/small/geroiz_191_chernyavskij.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_676")
                                                        .get("/storage/heroez/small/geroiz_248_chesnokov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_677")
                                                        .get("/storage/heroez/small/geroiz_276_chetkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_678")
                                                        .get("/storage/heroez/small/geroiz_663_chihachev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_679")
                                                        .get("/storage/heroez/small/geroiz_338_chornyj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_680")
                                                        .get("/storage/heroez/small/geroiz_375_chubrik.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_681")
                                                        .get("/storage/heroez/small/geroiz_531_chudan-ool.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_682")
                                                        .get("/storage/heroez/small/geroiz_533_chujkin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_683")
                                                        .get("/storage/heroez/small/geroiz_534_chykaj.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_684")
                                                        .get("/storage/heroez/small/geroiz_535_shalyk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_685")
                                                        .get("/storage/heroez/small/geroiz_223_shamalyuk.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_686")
                                                        .get("/storage/heroez/small/geroiz_102_shapovalov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_687")
                                                        .get("/storage/heroez/small/geroiz_165_shaphaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_688")
                                                        .get("/storage/heroez/small/geroiz_662_sharikov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_689")
                                                        .get("/storage/heroez/small/geroiz_010_shatohin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_690")
                                                        .get("/storage/heroez/small/geroiz_387_shashkov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_691")
                                                        .get("/storage/heroez/small/geroiz_536_shevchenko.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_692")
                                                        .get("/storage/heroez/small/geroiz_397_shejn.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_693")
                                                        .get("/storage/heroez/small/geroiz_667_shejn-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_694")
                                                        .get("/storage/heroez/small/geroiz_668_sheluhin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_695")
                                                        .get("/storage/heroez/small/geroiz_215_shepelev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_696")
                                                        .get("/storage/heroez/small/geroiz_255_sherstnev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_697")
                                                        .get("/storage/heroez/small/geroiz_453_shikarev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_698")
                                                        .get("/storage/heroez/small/geroiz_326_shilov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_699")
                                                        .get("/storage/heroez/small/geroiz_147_shipov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_700")
                                                        .get("/storage/heroez/small/geroiz_454_shipulin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_701")
                                                        .get("/storage/heroez/small/geroiz_669_shipulin-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_702")
                                                        .get("/storage/heroez/small/geroiz_455_shirenin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_703")
                                                        .get("/storage/heroez/small/geroiz_294_shitov-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_704")
                                                        .get("/storage/heroez/small/geroiz_187_shihzhamalov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_705")
                                                        .get("/storage/heroez/small/geroiz_456_shicz.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_706")
                                                        .get("/storage/heroez/small/geroiz_119_shishov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_707")
                                                        .get("/storage/heroez/small/geroiz_674_shomin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_708")
                                                        .get("/storage/heroez/small/geroiz_295_shorohov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_709")
                                                        .get("/storage/heroez/small/geroiz_457_shpenst.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_710")
                                                        .get("/storage/heroez/small/geroiz_092-shpilchin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_711")
                                                        .get("/storage/heroez/small/geroiz_458_shtri.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_712")
                                                        .get("/storage/heroez/small/geroiz_459_shukyurov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_713")
                                                        .get("/storage/heroez/small/geroiz_460_shhur.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_714")
                                                        .get("/storage/heroez/small/geroiz_389_erdni-goryaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_715")
                                                        .get("/storage/heroez/small/geroiz_266_yuganson.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_716")
                                                        .get("/storage/heroez/small/geroiz_171_yudaev-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_717")
                                                        .get("/storage/heroez/small/geroiz_675_yumatov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_718")
                                                        .get("/storage/heroez/small/geroiz_197_yurtaev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_719")
                                                        .get("/storage/heroez/small/geroiz_383_yusupov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_720")
                                                        .get("/storage/heroez/small/geroiz_462_yushkova-.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_721")
                                                        .get("/storage/heroez/small/geroiz_686_yakutin.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_722")
                                                        .get("/storage/heroez/small/geroiz_075-yalalov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_723")
                                                        .get("/storage/heroez/small/geroiz_687_yamaliev.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_724")
                                                        .get("/storage/heroez/small/geroiz_089-yapparov.jpeg")
                                                        .headers(headersAS14_52),
                                                http("request_725")
                                                        .get("/storage/heroez/small/geroiz_688_yashhurinskij.jpeg")
                                                        .headers(headersAS14_52)
                                        )
                        );

        HttpProtocolBuilder httpProtocol_Otmena = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS15_0 = new HashMap<>();
        headersAS15_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS15_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS15_0.put("sec-ch-ua-mobile", "?0");
        headersAS15_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS15_3 = new HashMap<>();
        headersAS15_3.put("Origin", "https://asafov.ru");
        headersAS15_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS15_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS15_3.put("sec-ch-ua-mobile", "?0");
        headersAS15_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS15_23 = new HashMap<>();
        headersAS15_23.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS15_23.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS15_23.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS15_23.put("priority", "u=0, i");
        headersAS15_23.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS15_23.put("sec-ch-ua-mobile", "?0");
        headersAS15_23.put("sec-ch-ua-platform", "Linux");
        headersAS15_23.put("sec-fetch-dest", "document");
        headersAS15_23.put("sec-fetch-mode", "navigate");
        headersAS15_23.put("sec-fetch-site", "same-origin");
        headersAS15_23.put("sec-fetch-user", "?1");
        headersAS15_23.put("upgrade-insecure-requests", "1");
        headersAS15_23.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS15_42 = new HashMap<>();
        headersAS15_42.put("accept", "*/*");
        headersAS15_42.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS15_42.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS15_42.put("origin", "https://asafov.ru");
        headersAS15_42.put("priority", "u=1, i");
        headersAS15_42.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS15_42.put("sec-ch-ua-mobile", "?0");
        headersAS15_42.put("sec-ch-ua-platform", "Linux");
        headersAS15_42.put("sec-fetch-dest", "empty");
        headersAS15_42.put("sec-fetch-mode", "cors");
        headersAS15_42.put("sec-fetch-site", "cross-site");
        headersAS15_42.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS15_43 = new HashMap<>();
        headersAS15_43.put("Upgrade-Insecure-Requests", "1");
        headersAS15_43.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS15_43.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS15_43.put("sec-ch-ua-mobile", "?0");
        headersAS15_43.put("sec-ch-ua-platform", "Linux");


        ScenarioBuilder scnAS15 = scenario("Projects.asafov.Otmena")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS15_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS15_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS15_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS15_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS15_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS15_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS15_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS15_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS15_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS15_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS15_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS15_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS15_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS15_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS15_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS15_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS15_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS15_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS15_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS15_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS15_0),
                                        http("request_21")
                                                .get("/assets/img/spec/00.jpg")
                                                .headers(headersAS15_0),
                                        http("request_22")
                                                .get("/assets/img/spec/whatsapp-image-2022-04-29-at-20.01.57.jpeg")
                                                .headers(headersAS15_0),
                                        http("request_23")
                                                .get("/spec/cancel-culture-russia")
                                                .headers(headersAS15_23),
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
                                                .get("/build/assets/FiraSans-Italic-CfysYJJW.woff2"),
                                        http("request_31")
                                                .get("/assets/img/spec/whatsapp-image-2022-04-29-at-19.57.09.jpeg")
                                                .headers(headersAS15_0),
                                        http("request_32")
                                                .get("/assets/img/spec/whatsapp-image-2022-04-29-at-19.57.09-1.jpeg")
                                                .headers(headersAS15_0),
                                        http("request_33")
                                                .get("/assets/img/spec/whatsapp-image-2022-04-29-at-19.57.10.jpeg")
                                                .headers(headersAS15_0),
                                        http("request_34")
                                                .get("/assets/img/spec/whatsapp-image-2022-04-29-at-19.57.10-1.jpeg")
                                                .headers(headersAS15_0),
                                        http("request_35")
                                                .get("/assets/img/spec/whatsapp-image-2022-04-29-at-19.57.11.jpeg")
                                                .headers(headersAS15_0),
                                        http("request_36")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS15_0),
                                        http("request_37")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
//                                        http("request_38")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS15_0),
                                        http("request_39")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS15_3),
                                        http("request_40")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS15_3),
                                        http("request_41")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS15_0),
                                        http("request_42")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fspec%2Fcancel-culture-russia&page-ref=https%3A%2F%2Fasafov.ru%2Fspec%2Fheroez&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A477620122%3Az%3A300%3Ai%3A20240826204742%3Aet%3A1724687262%3Ac%3A1%3Arn%3A264314107%3Arqn%3A98%3Au%3A1724676906572442126%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A438%3Awv%3A2%3Ads%3A0%2C0%2C98%2C149%2C1%2C0%2C%2C209%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724687261302%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724687262%3At%3A%D0%9A%D1%83%D0%BB%D1%8C%D1%82%20%D0%BE%D1%82%D0%BC%D0%B5%D0%BD%D1%8B%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS15_42)
//                                        http("request_43")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS15_43)
                                )
                );

        HttpProtocolBuilder httpProtocol_ProDEG = http
                .baseUrl("https://mc.yandex.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS19_0 = new HashMap<>();
        headersAS19_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS19_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_0.put("sec-ch-ua-mobile", "?0");
        headersAS19_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS19_22 = new HashMap<>();
        headersAS19_22.put("Origin", "https://prodeg.asafov.ru");
        headersAS19_22.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS19_22.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_22.put("sec-ch-ua-mobile", "?0");
        headersAS19_22.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS19_38 = new HashMap<>();
        headersAS19_38.put("Upgrade-Insecure-Requests", "1");
        headersAS19_38.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS19_38.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_38.put("sec-ch-ua-mobile", "?0");
        headersAS19_38.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS19_39 = new HashMap<>();
        headersAS19_39.put("accept", "*/*");
        headersAS19_39.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS19_39.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS19_39.put("origin", "https://prodeg.asafov.ru");
        headersAS19_39.put("priority", "u=1, i");
        headersAS19_39.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_39.put("sec-ch-ua-mobile", "?0");
        headersAS19_39.put("sec-ch-ua-platform", "Linux");
        headersAS19_39.put("sec-fetch-dest", "empty");
        headersAS19_39.put("sec-fetch-mode", "cors");
        headersAS19_39.put("sec-fetch-site", "cross-site");
        headersAS19_39.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS19_43 = new HashMap<>();
        headersAS19_43.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS19_43.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS19_43.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS19_43.put("priority", "u=0, i");
        headersAS19_43.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_43.put("sec-ch-ua-mobile", "?0");
        headersAS19_43.put("sec-ch-ua-platform", "Linux");
        headersAS19_43.put("sec-fetch-dest", "document");
        headersAS19_43.put("sec-fetch-mode", "navigate");
        headersAS19_43.put("sec-fetch-site", "cross-site");
        headersAS19_43.put("sec-fetch-user", "?1");
        headersAS19_43.put("upgrade-insecure-requests", "1");
        headersAS19_43.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS19_59 = new HashMap<>();
        headersAS19_59.put("accept", "*/*");
        headersAS19_59.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS19_59.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS19_59.put("origin", "https://prodeg.asafov.ru");
        headersAS19_59.put("priority", "u=4, i");
        headersAS19_59.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_59.put("sec-ch-ua-mobile", "?0");
        headersAS19_59.put("sec-ch-ua-platform", "Linux");
        headersAS19_59.put("sec-fetch-dest", "empty");
        headersAS19_59.put("sec-fetch-mode", "no-cors");
        headersAS19_59.put("sec-fetch-site", "cross-site");
        headersAS19_59.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS19_61 = new HashMap<>();
        headersAS19_61.put("accept", "application/json, text/javascript, */*; q=0.01");
        headersAS19_61.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS19_61.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS19_61.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        headersAS19_61.put("origin", "https://prodeg.asafov.ru");
        headersAS19_61.put("priority", "u=1, i");
        headersAS19_61.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS19_61.put("sec-ch-ua-mobile", "?0");
        headersAS19_61.put("sec-ch-ua-platform", "Linux");
        headersAS19_61.put("sec-fetch-dest", "empty");
        headersAS19_61.put("sec-fetch-mode", "cors");
        headersAS19_61.put("sec-fetch-site", "same-origin");
        headersAS19_61.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS19_61.put("x-requested-with", "XMLHttpRequest");

        String uri2 = "https://prodeg.asafov.ru";

        String uri3 = "https://fonts.gstatic.com/s";

        String uri4 = "https://fonts.googleapis.com/css2";

        ScenarioBuilder scnAS19 = scenario("Projects.asafov.prodeg")
                .exec(
                        http("request_0")
                                .get(uri4 + "?family=Roboto+Mono:ital,wght@0,100..700;1,100..700&family=Unbounded:wght@200..900&display=swap")
                                .headers(headersAS19_0)
                                .resources(
                                        http("request_1")
                                                .get(uri2 + "/assets/css/bootstrap.css")
                                                .headers(headersAS19_0),
                                        http("request_2")
                                                .get(uri2 + "/assets/css/bs-rewrite.css")
                                                .headers(headersAS19_0),
                                        http("request_3")
                                                .get(uri2 + "/assets/css/accordion-rewrite-slider.css")
                                                .headers(headersAS19_0),
                                        http("request_4")
                                                .get(uri2 + "/assets/css/accordion-rewrite-faq.css")
                                                .headers(headersAS19_0),
                                        http("request_5")
                                                .get(uri2 + "/assets/css/accordion-rewrite-fakes.css")
                                                .headers(headersAS19_0),
                                        http("request_6")
                                                .get(uri2 + "/assets/css/style.css")
                                                .headers(headersAS19_0),
                                        http("request_7")
                                                .get(uri2 + "/assets/css/map.css")
                                                .headers(headersAS19_0),
                                        http("request_8")
                                                .get(uri2 + "/assets/css/map-regions.css")
                                                .headers(headersAS19_0),
                                        http("request_9")
                                                .get(uri2 + "/assets/css/lightslider.css")
                                                .headers(headersAS19_0),
                                        http("request_10")
                                                .get(uri2 + "/assets/js/bootstrap.bundle.js")
                                                .headers(headersAS19_0),
                                        http("request_11")
                                                .get(uri2 + "/assets/js/jquery-3.7.1.min.js")
                                                .headers(headersAS19_0),
                                        http("request_12")
                                                .get(uri2 + "/assets/js/lightslider.js")
                                                .headers(headersAS19_0),
                                        http("request_13")
                                                .get(uri2 + "/assets/js/main.js")
                                                .headers(headersAS19_0),
                                        http("request_14")
                                                .get(uri2 + "/assets/images/svg/logo-white.svg")
                                                .headers(headersAS19_0),
                                        http("request_15")
                                                .get(uri2 + "/assets/images/svg/download-btn.svg")
                                                .headers(headersAS19_0),
                                        http("request_16")
                                                .get(uri2 + "/assets/images/svg/logo-colored.svg")
                                                .headers(headersAS19_0),
//                                        http("request_17")
//                                                .get("/metrika/tag.js")
//                                                .headers(headersAS19_0),
                                        http("request_18")
                                                .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhPq3-OXg.woff2"),
                                        http("request_19")
                                                .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhLq38.woff2"),
                                        http("request_20")
                                                .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwv8ZfrxE.woff2"),
                                        http("request_21")
                                                .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwu8Zf.woff2"),
                                        http("request_22")
                                                .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhPq3-OXg.woff2")
                                                .headers(headersAS19_22),
                                        http("request_23")
                                                .get(uri3 + "/robotomono/v23/L0x5DF4xlVMF-BfR8bXMIjhLq38.woff2")
                                                .headers(headersAS19_22),
                                        http("request_24")
                                                .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwv8ZfrxE.woff2")
                                                .headers(headersAS19_22),
                                        http("request_25")
                                                .get(uri3 + "/unbounded/v7/Yq6W-LOTXCb04q32xlpwu8Zf.woff2")
                                                .headers(headersAS19_22),
                                        http("request_26")
                                                .get(uri2 + "/assets/images/svg/pixel-trailing-bg.svg")
                                                .headers(headersAS19_0),
                                        http("request_27")
                                                .get(uri2 + "/assets/images/svg/slider-dots.svg"),
                                        http("request_28")
                                                .get(uri2 + "/assets/images/who/sobyanin.jpg")
                                                .headers(headersAS19_0),
                                        http("request_29")
                                                .get(uri2 + "/assets/images/who/peskov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_30")
                                                .get(uri2 + "/assets/images/who/putin.jpg")
                                                .headers(headersAS19_0),
                                        http("request_31")
                                                .get(uri2 + "/assets/images/who/mishustin.jpg")
                                                .headers(headersAS19_0),
                                        http("request_32")
                                                .get(uri2 + "/assets/images/who/chernyshenko.jpg")
                                                .headers(headersAS19_0),
                                        http("request_33")
                                                .get(uri2 + "/assets/images/who/medvedev.jpg")
                                                .headers(headersAS19_0),
                                        http("request_34")
                                                .get(uri2 + "/assets/images/who/manturov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_35")
                                                .get(uri2 + "/assets/images/who/mashkov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_36")
                                                .get(uri2 + "/assets/images/who/novak.jpg")
                                                .headers(headersAS19_0),
                                        http("request_37")
                                                .get(uri2 + "/assets/images/other/chart-deg.jpg")
                                                .headers(headersAS19_0),
//                                        http("request_38")
//                                                .get("/metrika/metrika_match.html")
//                                                .headers(headersAS19_38),
                                        http("request_39")
                                                .get("/watch/96586904?wmode=7&page-url=https%3A%2F%2Fprodeg.asafov.ru%2F%23&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A700442758813%3Ahid%3A236092770%3Az%3A300%3Ai%3A20240827092205%3Aet%3A1724732525%3Ac%3A1%3Arn%3A480708180%3Arqn%3A4%3Au%3A1724676906572442126%3Aw%3A1920x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C198%2C%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724732525052%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732525%3At%3A%D0%94%D0%B8%D1%81%D1%82%D0%B0%D0%BD%D1%86%D0%B8%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D1%8D%D0%BB%D0%B5%D0%BA%D1%82%D1%80%D0%BE%D0%BD%D0%BD%D0%BE%D0%B5%20%D0%B3%D0%BE%D0%BB%D0%BE%D1%81%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%2C%20%D0%B2%D1%81%D0%B5%20%D0%BE%20%D0%94%D0%AD%D0%93%20%D0%B2%202024%20%D0%B3%D0%BE%D0%B4%D1%83&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037572)ti(1)")
                                                .headers(headersAS19_39),
                                        http("request_40")
                                                .get(uri2 + "/assets/images/opinions/vybornyy.jpg")
                                                .headers(headersAS19_0),
                                        http("request_41")
                                                .get(uri2 + "/assets/images/opinions/kudzagova.jpg")
                                                .headers(headersAS19_0),
                                        http("request_42")
                                                .get(uri2 + "/assets/images/opinions/naumov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_43")
                                                .get(uri2 + "/")
                                                .headers(headersAS19_43),
                                        http("request_44")
                                                .get(uri2 + "/assets/images/opinions/nilov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_45")
                                                .get(uri2 + "/assets/images/opinions/nifantiev.jpg")
                                                .headers(headersAS19_0),
                                        http("request_46")
                                                .get(uri2 + "/assets/images/opinions/romanenko.jpg")
                                                .headers(headersAS19_0),
                                        http("request_47")
                                                .get(uri2 + "/assets/images/opinions/hvostov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_48")
                                                .get(uri2 + "/assets/images/opinions/chernishov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_49")
                                                .get(uri2 + "/assets/images/opinions/asafov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_50")
                                                .get(uri2 + "/assets/images/opinions/bashirov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_51")
                                                .get(uri2 + "/assets/images/opinions/martinov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_52")
                                                .get(uri2 + "/assets/images/opinions/starovoitov.jpg")
                                                .headers(headersAS19_0),
                                        http("request_53")
                                                .get(uri2 + "/assets/images/svg/pixel-trailing-dark-bg.svg")
                                                .headers(headersAS19_0),
                                        http("request_54")
                                                .get(uri2 + "/assets/images/svg/accordeon-arrow-fakes.svg"),
                                        http("request_55")
                                                .get(uri2 + "/assets/images/opinions/shapovalov.jpeg")
                                                .headers(headersAS19_0),
                                        http("request_56")
                                                .get(uri2 + "/assets/images/svg/accordeon-arrow.svg"),
                                        http("request_57")
                                                .get(uri2 + "/favicon.ico?v1")
                                                .headers(headersAS19_0),
                                        http("request_58")
                                                .get(uri2 + "/favicon.ico?v1")
                                                .headers(headersAS19_0)
                                )

                )
                .exec(
                        http("request_60")
                                .post("/watch/96586904/1?page-url=https%3A%2F%2Fprodeg.asafov.ru%2F%23&charset=utf-8&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1724732525_3c45def8d1aa2c33969a3875b59b7b9be0e6e65baf58499388cc2b1d52cce93d&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A700442758813%3Ahid%3A236092770%3Az%3A300%3Ai%3A20240827092233%3Aet%3A1724732553%3Ac%3A1%3Arn%3A248850088%3Arqn%3A6%3Au%3A1724676906572442126%3Aw%3A1905x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1724732525052%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732553&t=gdpr(14)clc(2-950-709)rqnt(3)aw(1)rcm(0)cdl(na)eco(21037572)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22fi%22%3A%22a(1)b(PA3AA~)c(7zOtRVrx01D5q8kJJgHz8jLSzo5PvwqlMt2LkDyJGrs%3D)%22%2C%22ite%22%3A1%7D%7D")
                                .headers(headersAS19_59)
                                .resources(
                                        http("request_61")
                                                .post(uri2 + "/send.php")
                                                .headers(headersAS19_61)
                                                .formParam("name",  "Dog" + RandomForAS19.nextInt(1000))
                                                .formParam("email", "dog" + RandomForAS19.nextInt(1000) + "@mail.ru")
                                                .formParam("message",  "Dog" + RandomForAS19.nextInt(100))
                                )
                );

        HttpProtocolBuilder httpProtocol_Gosduma = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS20_0 = new HashMap<>();
        headersAS20_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS20_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS20_0.put("sec-ch-ua-mobile", "?0");
        headersAS20_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS20_3 = new HashMap<>();
        headersAS20_3.put("Origin", "https://asafov.ru");
        headersAS20_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS20_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS20_3.put("sec-ch-ua-mobile", "?0");
        headersAS20_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS20_27 = new HashMap<>();
        headersAS20_27.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS20_27.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS20_27.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS20_27.put("priority", "u=0, i");
        headersAS20_27.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS20_27.put("sec-ch-ua-mobile", "?0");
        headersAS20_27.put("sec-ch-ua-platform", "Linux");
        headersAS20_27.put("sec-fetch-dest", "document");
        headersAS20_27.put("sec-fetch-mode", "navigate");
        headersAS20_27.put("sec-fetch-site", "cross-site");
        headersAS20_27.put("sec-fetch-user", "?1");
        headersAS20_27.put("upgrade-insecure-requests", "1");
        headersAS20_27.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS20_67 = new HashMap<>();
        headersAS20_67.put("accept", "*/*");
        headersAS20_67.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS20_67.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS20_67.put("origin", "https://asafov.ru");
        headersAS20_67.put("priority", "u=1, i");
        headersAS20_67.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS20_67.put("sec-ch-ua-mobile", "?0");
        headersAS20_67.put("sec-ch-ua-platform", "Linux");
        headersAS20_67.put("sec-fetch-dest", "empty");
        headersAS20_67.put("sec-fetch-mode", "cors");
        headersAS20_67.put("sec-fetch-site", "cross-site");
        headersAS20_67.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS20_68 = new HashMap<>();
        headersAS20_68.put("Upgrade-Insecure-Requests", "1");
        headersAS20_68.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS20_68.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS20_68.put("sec-ch-ua-mobile", "?0");
        headersAS20_68.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS20_260 = new HashMap<>();
        headersAS20_260.put("accept", "*/*");
        headersAS20_260.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS20_260.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS20_260.put("origin", "https://asafov.ru");
        headersAS20_260.put("priority", "u=4, i");
        headersAS20_260.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS20_260.put("sec-ch-ua-mobile", "?0");
        headersAS20_260.put("sec-ch-ua-platform", "Linux");
        headersAS20_260.put("sec-fetch-dest", "empty");
        headersAS20_260.put("sec-fetch-mode", "no-cors");
        headersAS20_260.put("sec-fetch-site", "cross-site");
        headersAS20_260.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");


        ScenarioBuilder scnAS20 = scenario("Projects.asafov.Gosduma")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS20_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS20_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS20_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS20_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS20_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS20_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS20_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS20_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS20_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS20_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS20_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS20_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS20_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS20_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS20_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS20_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS20_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS20_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS20_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS20_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS20_0),
                                        http("request_21")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_22")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_23")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_24")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_25")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Bold-BlEr9TTu.woff2"),
                                        http("request_27")
                                                .get("/gosduma")
                                                .headers(headersAS20_27),
                                        http("request_28")
                                                .get("/storage/people/7/abakarov-hizri-magomedovich-7.webp")
                                                .headers(headersAS20_0),
                                        http("request_29")
                                                .get("/storage/people/117/agaev-bekhan-vahaevich-117.webp")
                                                .headers(headersAS20_0),
                                        http("request_30")
                                                .get("/storage/people/337/amelchenkova-olga-nikolaevna-337.webp")
                                                .headers(headersAS20_0),
                                        http("request_31")
                                                .get("/storage/people/462/antropenko-igor-aleksandrovich-462.webp")
                                                .headers(headersAS20_0),
                                        http("request_32")
                                                .get("/storage/people/467/anufrieva-olga-nikolaevna-467.webp")
                                                .headers(headersAS20_0),
                                        http("request_33")
                                                .get("/storage/people/560/arshba-otari-ionovich-560.webp")
                                                .headers(headersAS20_0),
                                        http("request_34")
                                                .get("/storage/people/561/arshinova-alyona-igorevna-561.webp")
                                                .headers(headersAS20_0),
                                        http("request_35")
                                                .get("/storage/people/620/ayupov-rinat-zajdulaevich-620.webp")
                                                .headers(headersAS20_0),
                                        http("request_36")
                                                .get("/storage/people/767/barahoev-bekhan-abdulhamidovich-767.webp")
                                                .headers(headersAS20_0),
                                        http("request_37")
                                                .get("/storage/people/810/batalova-rima-akberdinovna-810.webp")
                                                .headers(headersAS20_0),
                                        http("request_38")
                                                .get("/storage/people/875/belik-dmitrij-anatolevich-875.webp")
                                                .headers(headersAS20_0),
                                        http("request_39")
                                                .get("/storage/people/983/bessarab-svetlana-viktorovna-983.webp")
                                                .headers(headersAS20_0),
                                        http("request_40")
                                                .get("/storage/people/997/bidonko-sergej-yurevich-997.webp")
                                                .headers(headersAS20_0),
                                        http("request_41")
                                                .get("/storage/people/1020/bichaev-artem-aleksandrovich-1020.webp")
                                                .headers(headersAS20_0),
                                        http("request_42")
                                                .get("/storage/people/1084/boguslavskij-irek-borisovich-1084.webp")
                                                .headers(headersAS20_0),
                                        http("request_43")
                                                .get("/storage/people/1163/borisov-aleksandr-aleksandrovich-1163.webp")
                                                .headers(headersAS20_0),
                                        http("request_44")
                                                .get("/storage/people/1198/borodaj-aleksandr-yurevich-1198.webp")
                                                .headers(headersAS20_0),
                                        http("request_45")
                                                .get("/storage/people/1232/boyarskij-sergej-mihajlovich-1232.webp")
                                                .headers(headersAS20_0),
                                        http("request_46")
                                                .get("/storage/people/1277/buduev-nikolaj-robertovich-1277.webp")
                                                .headers(headersAS20_0),
                                        http("request_47")
                                                .get("/storage/people/1318/buranova-larisa-nikolaevna-1318.webp")
                                                .headers(headersAS20_0),
                                        http("request_48")
                                                .get("/storage/people/1364/butina-mariya-valerevna-1364.webp")
                                                .headers(headersAS20_0),
                                        http("request_49")
                                                .get("/storage/people/1428/valeev-ernest-abdulovich-1428.webp")
                                                .headers(headersAS20_0),
                                        http("request_50")
                                                .get("/storage/people/1493/vasilkova-mariya-viktorovna-1493.webp")
                                                .headers(headersAS20_0),
                                        http("request_51")
                                                .get("/storage/people/1541/veremeenko-sergej-alekseevich-1541.webp")
                                                .headers(headersAS20_0),
                                        http("request_52")
                                                .get("/storage/people/1641/vlasova-veronika-valerievna-1641.webp")
                                                .headers(headersAS20_0),
                                        http("request_53")
                                                .get("/storage/people/1647/vodolaczkij-viktor-petrovich-1647.webp")
                                                .headers(headersAS20_0),
                                        http("request_54")
                                                .get("/storage/people/1777/voronovskij-anatolij-vladimirovich-1777.webp")
                                                .headers(headersAS20_0),
                                        http("request_55")
                                                .get("/storage/people/1801/vybornyj-anatolij-borisovich-1801.webp")
                                                .headers(headersAS20_0),
                                        http("request_56")
                                                .get("/storage/people/1812/vyatkin-dmitrij-fedorovich-1812.webp")
                                                .headers(headersAS20_0),
                                        http("request_57")
                                                .get("/storage/people/1849/gadzhiev-ruslan-gadzhievich-1849.webp")
                                                .headers(headersAS20_0),
                                        http("request_58")
                                                .get("/storage/people/1943/gekkiev-zaur-dalhatovich-1943.webp")
                                                .headers(headersAS20_0),
                                        http("request_59")
                                                .get("/storage/people/2035/govyrin-aleksej-borisovich-2035.webp")
                                                .headers(headersAS20_0),
                                        http("request_60")
                                                .get("/storage/people/2049/golikov-oleg-aleksandrovich-2049.webp")
                                                .headers(headersAS20_0),
                                        http("request_61")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_62")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS20_0),
//                                        http("request_63")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS20_0),
                                        http("request_64")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS20_3),
                                        http("request_65")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS20_3),
                                        http("request_66")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS20_0),
                                        http("request_67")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fgosduma&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A214201307%3Az%3A300%3Ai%3A20240827092336%3Aet%3A1724732617%3Ac%3A1%3Arn%3A1056644025%3Arqn%3A142%3Au%3A1724676906572442126%3Aw%3A1905x959%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C470%2C96%2C0%2C0%2C%2C74%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724732615718%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732617%3At%3A%D0%93%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F%20%D0%B4%D1%83%D0%BC%D0%B0%20%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B9%D1%81%D0%BA%D0%BE%D0%B9%20%D0%A4%D0%B5%D0%B4%D0%B5%D1%80%D0%B0%D1%86%D0%B8%D0%B8%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS20_67)
//                                        http("request_68")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS20_68)
                                )

                )
                .exec(
                        http("request_72")
                                .get("/storage/people/2481/danchikova-galina-innokentevna-2481.webp")
                                .headers(headersAS20_0)
                                .resources(
                                        http("request_73")
                                                .get("/storage/people/2656/dogaev-ahmed-shamhanovich-2656.webp")
                                                .headers(headersAS20_0),
                                        http("request_74")
                                                .get("/storage/people/2683/doluda-nikolaj-aleksandrovich-2683.webp")
                                                .headers(headersAS20_0),
                                        http("request_75")
                                                .get("/storage/people/2726/drozhzhina-yuliya-nikolaevna-2726.webp")
                                                .headers(headersAS20_0),
                                        http("request_76")
                                                .get("/storage/people/2791/dyakonova-tatyana-ivanovna-2791.webp")
                                                .headers(headersAS20_0),
                                        http("request_77")
                                                .get("/storage/people/2961/efimov-vitalij-borisovich-2961.webp")
                                                .headers(headersAS20_0),
                                        http("request_78")
                                                .get("/storage/people/3069/zhukov-aleksandr-dmitrievich-3069.webp")
                                                .headers(headersAS20_0),
                                        http("request_79")
                                                .get("/storage/people/3388/ivanov-vladimir-valerevich-3388.webp")
                                                .headers(headersAS20_0),
                                        http("request_80")
                                                .get("/storage/people/3401/ivanov-maksim-evgenevich-3401.webp")
                                                .headers(headersAS20_0),
                                        http("request_81")
                                                .get("/storage/people/3455/ivlev-leonid-grigorevich-3455.webp")
                                                .headers(headersAS20_0),
                                        http("request_82")
                                                .get("/storage/people/3509/ilinyh-vladimir-alekseevich-3509.webp")
                                                .headers(headersAS20_0),
                                        http("request_83")
                                                .get("/storage/people/3585/kadenkov-dmitrij-mihajlovich-3585.webp")
                                                .headers(headersAS20_0),
                                        http("request_84")
                                                .get("/storage/people/3644/kalimullin-rustam-galiullovich-3644.webp")
                                                .headers(headersAS20_0),
                                        http("request_85")
                                                .get("/storage/people/3724/kara-ool-sholban-valerevich-3724.webp")
                                                .headers(headersAS20_0),
                                        http("request_86")
                                                .get("/storage/people/3755/karmazina-raisa-vasilevna-3755.webp")
                                                .headers(headersAS20_0),
                                        http("request_87")
                                                .get("/storage/people/3772/karpov-anatolij-evgenevich-3772.webp")
                                                .headers(headersAS20_0),
                                        http("request_88")
                                                .get("/storage/people/3790/kartapolov-andrej-valerievich-3790.webp")
                                                .headers(headersAS20_0),
                                        http("request_89")
                                                .get("/storage/people/3860/kidyaev-viktor-borisovich-3860.webp")
                                                .headers(headersAS20_0),
                                        http("request_90")
                                                .get("/storage/people/3913/kiselyov-mihail-sergeevich-3913.webp")
                                                .headers(headersAS20_0),
                                        http("request_91")
                                                .get("/storage/people/3935/kislyakov-mihail-leonidovich-3935.webp")
                                                .headers(headersAS20_0),
                                        http("request_92")
                                                .get("/storage/people/4015/kobylkin-dmitrij-nikolaevich-4015.webp")
                                                .headers(headersAS20_0),
                                        http("request_93")
                                                .get("/storage/people/4383/kostenko-natalya-vasilevna-4383.webp")
                                                .headers(headersAS20_0),
                                        http("request_94")
                                                .get("/storage/people/4462/kravchenko-denis-borisovich-4462.webp")
                                                .headers(headersAS20_0),
                                        http("request_95")
                                                .get("/storage/people/4498/krasheninnikov-pavel-vladimirovich-4498.webp")
                                                .headers(headersAS20_0),
                                        http("request_96")
                                                .get("/storage/people/4512/krivonosov-sergej-vladimirovich-4512.webp")
                                                .headers(headersAS20_0),
                                        http("request_97")
                                                .get("/storage/people/4631/kuzneczov-eduard-anatolevich-4631.webp")
                                                .headers(headersAS20_0),
                                        http("request_98")
                                                .get("/storage/people/4635/kuzneczova-anna-yurevna-4635.webp")
                                                .headers(headersAS20_0),
                                        http("request_99")
                                                .get("/storage/people/4816/lavrinenko-aleksej-fedorovich-4816.webp")
                                                .headers(headersAS20_0),
                                        http("request_100")
                                                .get("/storage/people/4878/larionova-tatyana-petrovna-4878.webp")
                                                .headers(headersAS20_0),
                                        http("request_101")
                                                .get("/storage/people/4750/kurbanov-rizvan-daniyalovich-4750.webp")
                                                .headers(headersAS20_0),
                                        http("request_102")
                                                .get("/storage/people/4987/lechhadzhiev-ruslan-abdulvahievich-4987.webp")
                                                .headers(headersAS20_0),
                                        http("request_103")
                                                .get("/storage/people/5017/lisovskij-sergej-fedorovich-5017.webp")
                                                .headers(headersAS20_0),
                                        http("request_104")
                                                .get("/storage/people/5039/lihachev-vitalij-viktorovich-5039.webp")
                                                .headers(headersAS20_0),
                                        http("request_105")
                                                .get("/storage/people/5177/lyubarskij-roman-valerevich-5177.webp")
                                                .headers(headersAS20_0),
                                        http("request_106")
                                                .get("/storage/people/5238/makarov-andrej-mihajlovich-5238.webp")
                                                .headers(headersAS20_0),
                                        http("request_107")
                                                .get("/storage/people/5240/makarov-vyacheslav-serafimovich-5240.webp")
                                                .headers(headersAS20_0),
                                        http("request_108")
                                                .get("/storage/people/5255/makiev-zurab-gajozovich-5255.webp")
                                                .headers(headersAS20_0),
                                        http("request_109")
                                                .get("/storage/people/5467/matvejchev-oleg-anatolevich-5467.webp")
                                                .headers(headersAS20_0),
                                        http("request_110")
                                                .get("/storage/people/5591/metelev-artem-pavlovich-5591.webp")
                                                .headers(headersAS20_0),
                                        http("request_111")
                                                .get("/storage/people/5595/metshin-ajdar-raisovich-5595.webp")
                                                .headers(headersAS20_0),
                                        http("request_112")
                                                .get("/storage/people/5820/morozov-sergej-ivanovich-5820.webp")
                                                .headers(headersAS20_0),
                                        http("request_113")
                                                .get("/storage/people/5845/moskvichev-evgenij-sergeevich-5845.webp")
                                                .headers(headersAS20_0),
                                        http("request_114")
                                                .get("/storage/people/6021/nemkin-anton-igorevich-6021.webp")
                                                .headers(headersAS20_0),
                                        http("request_115")
                                                .get("/storage/people/6111/nikolaev-nikolaj-petrovich-6111.webp")
                                                .headers(headersAS20_0),
                                        http("request_116")
                                                .get("/storage/people/6135/nikonov-vyacheslav-alekseevich-6135.webp")
                                                .headers(headersAS20_0),
                                        http("request_117")
                                                .get("/storage/people/6221/nurbagandov-nurbagand-magomedovich-6221.webp")
                                                .headers(headersAS20_0),
                                        http("request_118")
                                                .get("/storage/people/6349/orlova-natalya-alekseevna-6349.webp")
                                                .headers(headersAS20_0),
                                        http("request_119")
                                                .get("/storage/people/6464/pankina-irina-aleksandrovna-6464.webp")
                                                .headers(headersAS20_0),
                                        http("request_120")
                                                .get("/storage/people/6478/parfenov-andrej-borisovich-6478.webp")
                                                .headers(headersAS20_0),
                                        http("request_121")
                                                .get("/storage/people/6580/petrov-vyacheslav-anatolevich-6580.webp")
                                                .headers(headersAS20_0),
                                        http("request_122")
                                                .get("/storage/people/6596/petrov-yurij-aleksandrovich-6596.webp")
                                                .headers(headersAS20_0),
                                        http("request_123")
                                                .get("/storage/people/6648/pinskij-viktor-vitalevich-6648.webp")
                                                .headers(headersAS20_0),
                                        http("request_124")
                                                .get("/storage/people/6651/pirog-dmitrij-yurevich-6651.webp")
                                                .headers(headersAS20_0),
                                        http("request_125")
                                                .get("/storage/people/6657/piskarev-vasilij-ivanovich-6657.webp")
                                                .headers(headersAS20_0),
                                        http("request_126")
                                                .get("/storage/people/6755/poluyanova-nataliya-vladimirovna-6755.webp")
                                                .headers(headersAS20_0),
                                        http("request_127")
                                                .get("/storage/people/6763/polyakova-alla-viktorovna-6763.webp")
                                                .headers(headersAS20_0),
                                        http("request_128")
                                                .get("/storage/people/7045/revenko-evgenij-vasilevich-7045.webp")
                                                .headers(headersAS20_0),
                                        http("request_129")
                                                .get("/storage/people/7070/resin-vladimir-iosifovich-7070.webp")
                                                .headers(headersAS20_0),
                                        http("request_130")
                                                .get("/storage/people/7097/rodina-viktoriya-sergeevna-7097.webp")
                                                .headers(headersAS20_0),
                                        http("request_131")
                                                .get("/storage/people/7213/rumyanczev-nikita-gennadevich-7213.webp")
                                                .headers(headersAS20_0),
                                        http("request_132")
                                                .get("/storage/people/7286/ryabczeva-zhanna-anatolevna-7286.webp")
                                                .headers(headersAS20_0),
                                        http("request_133")
                                                .get("/storage/people/7406/samokish-vladimir-igorevich-7406.webp")
                                                .headers(headersAS20_0),
                                        http("request_134")
                                                .get("/storage/people/7447/saraliev-shamsail-yunusovich-7447.webp")
                                                .headers(headersAS20_0),
                                        http("request_135")
                                                .get("/storage/people/7524/seliverstov-viktor-valentinovich-7524.webp")
                                                .headers(headersAS20_0),
                                        http("request_136")
                                                .get("/storage/people/7582/senin-vladimir-borisovich-7582.webp")
                                                .headers(headersAS20_0),
                                        http("request_137")
                                                .get("/storage/people/7668/simanovskij-leonid-yakovlevich-7668.webp")
                                                .headers(headersAS20_0),
                                        http("request_138")
                                                .get("/storage/people/7929/solodovnikov-ivan-aleksandrovich-7929.webp")
                                                .headers(headersAS20_0),
                                        http("request_139")
                                                .get("/storage/people/7979/stankevich-yurij-arkadevich-7979.webp")
                                                .headers(headersAS20_0),
                                        http("request_140")
                                                .get("/storage/people/8000/starshinov-mihail-evgenevich-8000.webp")
                                                .headers(headersAS20_0),
                                        http("request_141")
                                                .get("/storage/people/8260/terentev-mihail-borisovich-8260.webp")
                                                .headers(headersAS20_0),
                                        http("request_142")
                                                .get("/storage/people/8269/tereshkova-valentina-vladimirovna-8269.webp")
                                                .headers(headersAS20_0),
                                        http("request_143")
                                                .get("/storage/people/8355/tkachev-aleksej-nikolaevich-8355.webp")
                                                .headers(headersAS20_0),
                                        http("request_144")
                                                .get("/storage/people/8397/topilin-maksim-anatolevich-8397.webp")
                                                .headers(headersAS20_0),
                                        http("request_145")
                                                .get("/storage/people/8492/turov-artyom-viktorovich-8492.webp")
                                                .headers(headersAS20_0),
                                        http("request_146")
                                                .get("/storage/people/8571/umahanov-sajgidpasha-darbishevich-8571.webp")
                                                .headers(headersAS20_0),
                                        http("request_147")
                                                .get("/storage/people/8604/utyasheva-rimma-amirovna-8604.webp")
                                                .headers(headersAS20_0),
                                        http("request_148")
                                                .get("/storage/people/8633/farrahov-ajrat-zakievich-8633.webp")
                                                .headers(headersAS20_0),
                                        http("request_149")
                                                .get("/storage/people/8654/fedorov-evgenij-alekseevich-8654.webp")
                                                .headers(headersAS20_0),
                                        http("request_150")
                                                .get("/storage/people/8818/frolova-tamara-ivanovna-8818.webp")
                                                .headers(headersAS20_0),
                                        http("request_151")
                                                .get("/storage/people/8845/hamzaev-bijsultan-sultanbievich-8845.webp")
                                                .headers(headersAS20_0),
                                        http("request_152")
                                                .get("/storage/people/8871/hasanov-murat-ruslanovich-8871.webp")
                                                .headers(headersAS20_0),
                                        http("request_153")
                                                .get("/storage/people/8927/hor-gleb-yakovlevich-8927.webp")
                                                .headers(headersAS20_0),
                                        http("request_154")
                                                .get("/storage/people/9004/czunaeva-elena-moiseevna-9004.webp")
                                                .headers(headersAS20_0),
                                        http("request_155")
                                                .get("/storage/people/9258/shamanov-vladimir-anatolevich-9258.webp")
                                                .headers(headersAS20_0),
                                        http("request_156")
                                                .get("/storage/people/9326/shvytkin-yurij-nikolaevich-9326.webp")
                                                .headers(headersAS20_0),
                                        http("request_157")
                                                .get("/storage/people/9361/sheremet-mihail-sergeevich-9361.webp")
                                                .headers(headersAS20_0),
                                        http("request_158")
                                                .get("/storage/people/9475/sholohov-aleksandr-mihajlovich-9475.webp")
                                                .headers(headersAS20_0),
                                        http("request_159")
                                                .get("/storage/people/9552/shheglov-nikolaj-mihajlovich-9552.webp")
                                                .headers(headersAS20_0),
                                        http("request_160")
                                                .get("/storage/people/10161/sidyakin-aleksandr-gennadevich-10161.webp")
                                                .headers(headersAS20_0),
                                        http("request_161")
                                                .get("/storage/people/81/avdeev-mihail-yurevich-81.webp")
                                                .headers(headersAS20_0),
                                        http("request_162")
                                                .get("/storage/people/300/alimova-olga-nikolaevna-300.webp")
                                                .headers(headersAS20_0),
                                        http("request_163")
                                                .get("/storage/people/494/arefev-nikolaj-vasilevich-494.webp")
                                                .headers(headersAS20_0),
                                        http("request_164")
                                                .get("/storage/people/605/afonin-yurij-vyacheslavovich-605.webp")
                                                .headers(headersAS20_0),
                                        http("request_165")
                                                .get("/storage/people/636/babich-ivan-nikolaevich-636.webp")
                                                .headers(headersAS20_0),
                                        http("request_166")
                                                .get("/storage/people/974/berulava-mihail-nikolaevich-974.webp")
                                                .headers(headersAS20_0),
                                        http("request_167")
                                                .get("/storage/people/985/bessonov-evgenij-ivanovich-985.webp")
                                                .headers(headersAS20_0),
                                        http("request_168")
                                                .get("/storage/people/1018/bifov-anatolij-zhamalovich-1018.webp")
                                                .headers(headersAS20_0),
                                        http("request_169")
                                                .get("/storage/people/1479/vasilev-nikolaj-ivanovich-1479.webp")
                                                .headers(headersAS20_0),
                                        http("request_170")
                                                .get("/storage/people/1834/gavrilov-sergej-anatolevich-1834.webp")
                                                .headers(headersAS20_0),
                                        http("request_171")
                                                .get("/storage/people/2001/glazkova-anzhelika-egorovna-2001.webp")
                                                .headers(headersAS20_0),
                                        http("request_172")
                                                .get("/storage/people/2725/drobot-mariya-vladimirovna-2725.webp")
                                                .headers(headersAS20_0),
                                        http("request_173")
                                                .get("/storage/people/2865/ezerskij-nikolaj-nikolaevich-2865.webp")
                                                .headers(headersAS20_0),
                                        http("request_174")
                                                .get("/storage/people/3350/zyuganov-gennadij-andreevich-3350.webp")
                                                .headers(headersAS20_0),
                                        http("request_175")
                                                .get("/storage/people/3406/ivanov-nikolaj-nikolaevich-3406.webp")
                                                .headers(headersAS20_0),
                                        http("request_176")
                                                .get("/storage/people/3441/ivanyuzhenkov-boris-viktorovich-3441.webp")
                                                .headers(headersAS20_0),
                                        http("request_177")
                                                .get("/storage/people/3549/isakov-vladimir-3549.webp")
                                                .headers(headersAS20_0),
                                        http("request_178")
                                                .get("/storage/people/3690/kamnev-georgij-petrovich-3690.webp")
                                                .headers(headersAS20_0),
                                        http("request_179")
                                                .get("/storage/people/3838/kashin-vladimir-ivanovich-3838.webp")
                                                .headers(headersAS20_0),
                                        http("request_180")
                                                .get("/storage/people/4155/kolomejczev-nikolaj-vasilevich-4155.webp")
                                                .headers(headersAS20_0),
                                        http("request_181")
                                                .get("/storage/people/4209/komoczkij-boris-olegovich-4209.webp")
                                                .headers(headersAS20_0),
                                        http("request_182")
                                                .get("/storage/people/4310/kornienko-aleksej-viktorovich-4310.webp")
                                                .headers(headersAS20_0),
                                        http("request_183")
                                                .get("/storage/people/4442/kochiev-robert-ivanovich-4442.webp")
                                                .headers(headersAS20_0),
                                        http("request_184")
                                                .get("/storage/people/4720/kumin-vadim-valentinovich-4720.webp")
                                                .headers(headersAS20_0),
                                        http("request_185")
                                                .get("/storage/people/4766/kurinnyj-aleksej-vladimirovich-4766.webp")
                                                .headers(headersAS20_0),
                                        http("request_186")
                                                .get("/storage/people/4909/lebedev-oleg-aleksandrovich-4909.webp")
                                                .headers(headersAS20_0),
                                        http("request_187")
                                                .get("/storage/people/4932/levchenko-sergej-georgievich-4932.webp")
                                                .headers(headersAS20_0),
                                        http("request_188")
                                                .get("/storage/people/5189/lyabihov-roman-mihajlovich-5189.webp")
                                                .headers(headersAS20_0),
                                        http("request_189")
                                                .get("/storage/people/5414/marhaev-vyacheslav-mihajlovich-5414.webp")
                                                .headers(headersAS20_0),
                                        http("request_190")
                                                .get("/storage/people/5548/melnikov-ivan-ivanovich-5548.webp")
                                                .headers(headersAS20_0),
                                        http("request_191")
                                                .get("/storage/people/6167/novikov-dmitrij-georgievich-6167.webp")
                                                .headers(headersAS20_0),
                                        http("request_192")
                                                .get("/storage/people/6236/obuhov-sergej-pavlovich-6236.webp")
                                                .headers(headersAS20_0),
                                        http("request_193")
                                                .get("/storage/people/6355/osadchij-nikolaj-ivanovich-6355.webp")
                                                .headers(headersAS20_0),
                                        http("request_194")
                                                .get("/storage/people/6374/ostanina-nina-aleksandrovna-6374.webp")
                                                .headers(headersAS20_0),
                                        http("request_195")
                                                .get("/storage/people/6457/panteleev-sergej-mihajlovich-6457.webp")
                                                .headers(headersAS20_0),
                                        http("request_196")
                                                .get("/storage/people/6480/parfenov-denis-andreevich-6480.webp")
                                                .headers(headersAS20_0),
                                        http("request_197")
                                                .get("/storage/people/6895/prokofev-artyom-vyacheslavovich-6895.webp")
                                                .headers(headersAS20_0),
                                        http("request_198")
                                                .get("/storage/people/7332/saviczkaya-svetlana-evgenevna-7332.webp")
                                                .headers(headersAS20_0),
                                        http("request_199")
                                                .get("/storage/people/7685/sinelshhikov-yurij-petrovich-7685.webp")
                                                .headers(headersAS20_0),
                                        http("request_200")
                                                .get("/storage/people/7858/sobolev-viktor-ivanovich-7858.webp")
                                                .headers(headersAS20_0),
                                        http("request_201")
                                                .get("/storage/people/8097/sulejmanov-renat-ismailovich-8097.webp")
                                                .headers(headersAS20_0),
                                        http("request_202")
                                                .get("/storage/people/8179/tajsaev-kazbek-kuczukovich-8179.webp")
                                                .headers(headersAS20_0),
                                        http("request_203")
                                                .get("/storage/people/8709/filatova-irina-anatolevna-8709.webp")
                                                .headers(headersAS20_0),
                                        http("request_204")
                                                .get("/storage/people/8856/haritonov-nikolaj-mihajlovich-8856.webp")
                                                .headers(headersAS20_0),
                                        http("request_205")
                                                .get("/storage/people/9279/shargunov-sergej-aleksandrovich-9279.webp")
                                                .headers(headersAS20_0),
                                        http("request_206")
                                                .get("/storage/people/2838/egorov-vladislav-ivanovich-2838.webp")
                                                .headers(headersAS20_0),
                                        http("request_207")
                                                .get("/storage/people/8539/udalcova-anastasiia-olegovna-8539.webp")
                                                .headers(headersAS20_0),
                                        http("request_208")
                                                .get("/storage/people/9643/yushhenko-aleksandr-andreevich-9643.webp")
                                                .headers(headersAS20_0),
                                        http("request_209")
                                                .get("/storage/people/3743/karginov-sergej-genrihovich-3743.webp")
                                                .headers(headersAS20_0),
                                        http("request_210")
                                                .get("/storage/people/4447/koshelev-vladimir-alekseevich-4447.webp")
                                                .headers(headersAS20_0),
                                        http("request_211")
                                                .get("/storage/people/5114/lugovoj-andrej-konstantinovich-5114.webp")
                                                .headers(headersAS20_0),
                                        http("request_212")
                                                .get("/storage/people/5900/musatov-ivan-mihajlovich-5900.webp")
                                                .headers(headersAS20_0),
                                        http("request_213")
                                                .get("/storage/people/5967/napso-yurij-aisovich-5967.webp")
                                                .headers(headersAS20_0),
                                        http("request_214")
                                                .get("/storage/people/5981/naumov-stanislav-aleksandrovich-5981.webp")
                                                .headers(headersAS20_0),
                                        http("request_215")
                                                .get("/storage/people/6148/nilov-yaroslav-evgenevich-6148.webp")
                                                .headers(headersAS20_0),
                                        http("request_216")
                                                .get("/storage/people/6430/pajkin-boris-romanovich-6430.webp")
                                                .headers(headersAS20_0),
                                        http("request_217")
                                                .get("/storage/people/6443/panesh-kaplan-mugdinovich-6443.webp")
                                                .headers(headersAS20_0),
                                        http("request_218")
                                                .get("/storage/people/7480/svinczov-andrej-nikolaevich-7480.webp")
                                                .headers(headersAS20_0),
                                        http("request_219")
                                                .get("/storage/people/7492/svistunov-arkadij-nikolaevich-7492.webp")
                                                .headers(headersAS20_0),
                                        http("request_220")
                                                .get("/storage/people/7494/svishhev-dmitrij-aleksandrovich-7494.webp")
                                                .headers(headersAS20_0),
                                        http("request_221")
                                                .get("/storage/people/7517/seleznev-valerij-sergeevich-7517.webp")
                                                .headers(headersAS20_0),
                                        http("request_222")
                                                .get("/storage/people/7694/sipyagin-vladimir-vladimirovich-2-7694.webp")
                                                .headers(headersAS20_0),
                                        http("request_223")
                                                .get("/storage/people/7769/sluczkij-leonid-eduardovich-2-7769.webp")
                                                .headers(headersAS20_0),
                                        http("request_224")
                                                .get("/storage/people/8130/suharev-ivan-konstantinovich-2-8130.webp")
                                                .headers(headersAS20_0),
                                        http("request_225")
                                                .get("/storage/people/9109/chernyshov-boris-aleksandrovich-9109.webp")
                                                .headers(headersAS20_0),
                                        http("request_226")
                                                .get("/storage/people/10158/kulieva-vasilina-vasilevna-10158.webp")
                                                .headers(headersAS20_0),
                                        http("request_227")
                                                .get("/storage/people/10159/markov-evgenij-vladimirovich-10159.webp")
                                                .headers(headersAS20_0),
                                        http("request_228")
                                                .get("/storage/people/107/avksenteva-sardana-vladimirovna-107.webp")
                                                .headers(headersAS20_0),
                                        http("request_229")
                                                .get("/storage/people/484/arapov-georgij-konstantinovich-484.webp")
                                                .headers(headersAS20_0),
                                        http("request_230")
                                                .get("/storage/people/2197/goryacheva-kseniya-aleksandrovna-2197.webp")
                                                .headers(headersAS20_0),
                                        http("request_231")
                                                .get("/storage/people/2433/davankov-vladislav-andreevich-2433.webp")
                                                .headers(headersAS20_0),
                                        http("request_232")
                                                .get("/storage/people/2535/demin-aleksandr-vyacheslavovich-2535.webp")
                                                .headers(headersAS20_0),
                                        http("request_233")
                                                .get("/storage/people/6058/nechaev-aleksej-gennadevich-6058.webp")
                                                .headers(headersAS20_0),
                                        http("request_234")
                                                .get("/storage/people/6688/plyakin-vladimir-vladimirovich-6688.webp")
                                                .headers(headersAS20_0),
                                        http("request_235")
                                                .get("/storage/people/7744/skroznikova-anna-valerevna-7744.webp")
                                                .headers(headersAS20_0),
                                        http("request_236")
                                                .get("/storage/people/8224/tarbaev-sangadzhi-andreevich-8224.webp")
                                                .headers(headersAS20_0),
                                        http("request_237")
                                                .get("/storage/people/8356/tkachyov-anton-olegovich-8356.webp")
                                                .headers(headersAS20_0),
                                        http("request_238")
                                                .get("/storage/people/8849/hamitov-amir-mahsudovich-8849.webp")
                                                .headers(headersAS20_0),
                                        http("request_239")
                                                .get("/storage/people/9045/chemeris-roza-basirovna-9045.webp")
                                                .headers(headersAS20_0),
                                        http("request_240")
                                                .get("/storage/people/10772/samylin-yaroslav-alekseevich-1723630860-10772.webp")
                                                .headers(headersAS20_0),
                                        http("request_241")
                                                .get("/storage/people/343/ananskih-igor-aleksandrovich-343.webp")
                                                .headers(headersAS20_0),
                                        http("request_242")
                                                .get("/storage/people/623/babakov-aleksandr-mihajlovich-623.webp")
                                                .headers(headersAS20_0),
                                        http("request_243")
                                                .get("/storage/people/1328/burlyaev-nikolaj-petrovich-1328.webp")
                                                .headers(headersAS20_0),
                                        http("request_244")
                                                .get("/storage/people/2256/grigorev-yurij-innokentevich-2256.webp")
                                                .headers(headersAS20_0),
                                        http("request_245")
                                                .get("/storage/people/2408/gusev-dmitrij-gennadievich-2408.webp")
                                                .headers(headersAS20_0),
                                        http("request_246")
                                                .get("/storage/people/2522/delyagin-mihail-gennadevich-2522.webp")
                                                .headers(headersAS20_0),
                                        http("request_247")
                                                .get("/storage/people/3579/kabyshev-sergej-vladimirovich-3579.webp")
                                                .headers(headersAS20_0),
                                        http("request_248")
                                                .get("/storage/people/3711/kanokov-timur-borisovich-3711.webp")
                                                .headers(headersAS20_0),
                                        http("request_249")
                                                .get("/storage/people/4607/kuzneczov-andrej-anatolevich-4607.webp")
                                                .headers(headersAS20_0),
                                        http("request_250")
                                                .get("/storage/people/4620/kuzneczov-dmitrij-vadimovich-4620.webp")
                                                .headers(headersAS20_0),
                                        http("request_251")
                                                .get("/storage/people/4850/lantratova-yana-valerevna-4850.webp")
                                                .headers(headersAS20_0),
                                        http("request_252")
                                                .get("/storage/people/5651/mironov-sergej-mihajlovich-5651.webp")
                                                .headers(headersAS20_0),
                                        http("request_253")
                                                .get("/storage/people/6146/nilov-oleg-anatolevich-6146.webp")
                                                .headers(headersAS20_0),
                                        http("request_254")
                                                .get("/storage/people/6189/novichkov-nikolaj-vladimirovich-6189.webp")
                                                .headers(headersAS20_0),
                                        http("request_255")
                                                .get("/storage/people/7058/remezkov-aleksandr-aleksandrovich-7058.webp")
                                                .headers(headersAS20_0),
                                        http("request_256")
                                                .get("/storage/people/7572/semigin-gennadij-yurevich-7572.webp")
                                                .headers(headersAS20_0),
                                        http("request_257")
                                                .get("/storage/people/8257/terentev-aleksandr-vasilevich-8257.webp")
                                                .headers(headersAS20_0),
                                        http("request_258")
                                                .get("/storage/people/8488/tumusov-fedot-semenovich-8488.webp")
                                                .headers(headersAS20_0),
                                        http("request_259")
                                                .get("/storage/people/9051/chepa-aleksej-vasilevich-9051.webp")
                                                .headers(headersAS20_0)
                                )
                );

        //Выбор случайного поискового термина и его кодирование

        String searchTerm = getRandomSearchTerm();
        String encodedSearchTerm = encodeSearchTerm(searchTerm);

        HttpProtocolBuilder httpProtocol_Search = http
                .baseUrl("https://asafov.ru")
                .inferHtmlResources()
                ;

        Map<CharSequence, String> headersAS23_0 = new HashMap<>();
        headersAS23_0.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS23_0.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS23_0.put("sec-ch-ua-mobile", "?0");
        headersAS23_0.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS23_3 = new HashMap<>();
        headersAS23_3.put("Origin", "https://asafov.ru");
        headersAS23_3.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS23_3.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS23_3.put("sec-ch-ua-mobile", "?0");
        headersAS23_3.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS23_28 = new HashMap<>();
        headersAS23_28.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        headersAS23_28.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS23_28.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS23_28.put("priority", "u=0, i");
        headersAS23_28.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS23_28.put("sec-ch-ua-mobile", "?0");
        headersAS23_28.put("sec-ch-ua-platform", "Linux");
        headersAS23_28.put("sec-fetch-dest", "document");
        headersAS23_28.put("sec-fetch-mode", "navigate");
        headersAS23_28.put("sec-fetch-site", "cross-site");
        headersAS23_28.put("sec-fetch-user", "?1");
        headersAS23_28.put("upgrade-insecure-requests", "1");
        headersAS23_28.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");

        Map<CharSequence, String> headersAS23_33 = new HashMap<>();
        headersAS23_33.put("Upgrade-Insecure-Requests", "1");
        headersAS23_33.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");
        headersAS23_33.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS23_33.put("sec-ch-ua-mobile", "?0");
        headersAS23_33.put("sec-ch-ua-platform", "Linux");

        Map<CharSequence, String> headersAS23_34 = new HashMap<>();
        headersAS23_34.put("accept", "*/*");
        headersAS23_34.put("accept-encoding", "gzip, deflate, br, zstd");
        headersAS23_34.put("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7");
        headersAS23_34.put("origin", "https://asafov.ru");
        headersAS23_34.put("priority", "u=1, i");
        headersAS23_34.put("sec-ch-ua", "Chromium\";v=\"128\", \"Not;A=Brand\";v=\"24\", \"Google Chrome\";v=\"128");
        headersAS23_34.put("sec-ch-ua-mobile", "?0");
        headersAS23_34.put("sec-ch-ua-platform", "Linux");
        headersAS23_34.put("sec-fetch-dest", "empty");
        headersAS23_34.put("sec-fetch-mode", "cors");
        headersAS23_34.put("sec-fetch-site", "cross-site");
        headersAS23_34.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36");


        ScenarioBuilder scnAS23 = scenario("Projects.asafov.Search")
                .exec(
                        http("request_0")
                                .get("/build/assets/app-C22gTps0.css")
                                .headers(headersAS23_0)
                                .resources(
                                        http("request_1")
                                                .get("/build/assets/element-BvquaXif.css")
                                                .headers(headersAS23_0),
                                        http("request_2")
                                                .get("/build/assets/app-CIZP6loT.css")
                                                .headers(headersAS23_0),
                                        http("request_3")
                                                .get("/build/assets/app-DfRqwiiA.js")
                                                .headers(headersAS23_3),
                                        http("request_4")
                                                .get("/build/assets/element-zM6ahEp_.js")
                                                .headers(headersAS23_3),
                                        http("request_5")
                                                .get("/build/assets/_plugin-vue_export-helper-DHllfQ30.js")
                                                .headers(headersAS23_3),
                                        http("request_6")
                                                .get("/assets/css/cookies.css")
                                                .headers(headersAS23_0),
                                        http("request_7")
                                                .get("/assets/header/images/btn-burger.svg")
                                                .headers(headersAS23_0),
                                        http("request_8")
                                                .get("/assets/header/images/logos/mobile-logo.svg")
                                                .headers(headersAS23_0),
                                        http("request_9")
                                                .get("/assets/header/images/btn-search-white.svg")
                                                .headers(headersAS23_0),
                                        http("request_10")
                                                .get("/assets/header/images/logos/telegram-sm.svg")
                                                .headers(headersAS23_0),
                                        http("request_11")
                                                .get("/assets/header/images/logos/vk-sm.svg")
                                                .headers(headersAS23_0),
                                        http("request_12")
                                                .get("/assets/header/images/logos/dzen-sm.svg")
                                                .headers(headersAS23_0),
                                        http("request_13")
                                                .get("/assets/header/images/icons/x-mark.svg")
                                                .headers(headersAS23_0),
                                        http("request_14")
                                                .get("/assets/header/images/icons/quote.svg")
                                                .headers(headersAS23_0),
                                        http("request_15")
                                                .get("/assets/header/images/logos/telegram-xs.svg")
                                                .headers(headersAS23_0),
                                        http("request_16")
                                                .get("/assets/header/images/logos/vk-xs.svg")
                                                .headers(headersAS23_0),
                                        http("request_17")
                                                .get("/assets/header/images/logos/dzen-xs.svg")
                                                .headers(headersAS23_0),
                                        http("request_18")
                                                .get("/assets/header/images/logos/logo-asafov.svg")
                                                .headers(headersAS23_0),
                                        http("request_19")
                                                .get("/assets/header/images/logos/certificate.svg")
                                                .headers(headersAS23_0),
                                        http("request_20")
                                                .get("/assets/header/images/btn-search-black.svg")
                                                .headers(headersAS23_0),
                                        http("request_21")
                                                .get("/assets/img/logos/certificate-footer.svg")
                                                .headers(headersAS23_0),
                                        http("request_22")
                                                .get("/build/assets/bebasneueregular-DlvXiAZl.woff2"),
                                        http("request_23")
                                                .get("/build/assets/bebasneuebold-BLfzrUoX.woff2"),
                                        http("request_24")
                                                .get("/build/assets/FiraSans-Light-Dpds33Gt.woff2"),
                                        http("request_25")
                                                .get("/build/assets/FiraSans-Regular-BZiVxw3x.woff2"),
                                        http("request_26")
                                                .get("/build/assets/FiraSans-Medium-Bwy4KanC.woff2"),
                                        http("request_27")
                                                .get("/build/assets/secondary-md-ex-C-Ze4Brp.svg"),
                                        http("request_28")
                                                .get("/search?search=" + encodedSearchTerm)
                                                .headers(headersAS23_28),
//                                        http("request_29")
//                                                .get(uri1 + "/metrika/tag.js")
//                                                .headers(headersAS23_0),
                                        http("request_30")
                                                .get("/assets/js/front/cookies.js")
                                                .headers(headersAS23_3),
                                        http("request_31")
                                                .get("/assets/js/front/header.js")
                                                .headers(headersAS23_3),
                                        http("request_32")
                                                .get("/static/favicon.ico")
                                                .headers(headersAS23_0),
//                                        http("request_33")
//                                                .get(uri1 + "/metrika/metrika_match.html")
//                                                .headers(headersAS23_33),
                                        http("request_34")
                                                .get(uri1 + "/watch/64870417?wmode=7&page-url=https%3A%2F%2Fasafov.ru%2Fsearch%3Fsearch%3D%25D0%2597%25D1%258E%25D0%25B3%25D0%25B0%25D0%25BD%25D0%25BE%25D0%25B2&page-ref=https%3A%2F%2Fwww.google.com%2F&charset=utf-8&ut=noindex&uah=chu%0A%22Chromium%22%3Bv%3D%22128%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224%22%2C%22Google%20Chrome%22%3Bv%3D%22128%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A128.0.6613.84%0Achl%0A%22Chromium%22%3Bv%3D%22128.0.6613.84%22%2C%22Not%3BA%3DBrand%22%3Bv%3D%2224.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22128.0.6613.84%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1420%3Acn%3A1%3Adp%3A0%3Als%3A854160323908%3Ahid%3A52891059%3Az%3A300%3Ai%3A20240827092516%3Aet%3A1724732716%3Ac%3A1%3Arn%3A710073728%3Arqn%3A152%3Au%3A1724676906572442126%3Aw%3A1920x959%3As%3A1920x1080x24%3Ask%3A1%3Afp%3A329%3Awv%3A2%3Ads%3A0%2C0%2C214%2C114%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1724732716038%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1724732716%3At%3A%D0%A0%D0%B5%D0%B7%D1%83%D0%BB%D1%8C%D1%82%D0%B0%D1%82%20%D0%BF%D0%BE%D0%B8%D1%81%D0%BA%D0%B0%20%D0%B4%D0%BB%D1%8F%20%D0%B7%D0%B0%D0%BF%D1%80%D0%BE%D1%81%D0%B0%20%D0%97%D1%8E%D0%B3%D0%B0%D0%BD%D0%BE%D0%B2%20%7C%20ASAFOV.RU&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037580)ti(1)")
                                                .headers(headersAS23_34)
                                )
                );

//        Установки

        setUp(
                scnAS11.injectClosed(
                        constantConcurrentUsers(users_flood_AS11).during(40000)
                ).protocols(httpProtocol_TradCen)
                ,
                scnAS12.injectClosed(
                        constantConcurrentUsers(users_flood_AS12).during(40000)
                ).protocols(httpProtocol_Baza)
                ,
                scnAS13.injectClosed(
                        constantConcurrentUsers(users_flood_AS13).during(40000)
                ).protocols(httpProtocol_Strategy)
                ,
                scnAS14.injectClosed(
                        constantConcurrentUsers(users_flood_AS14).during(40000)
                ).protocols(httpProtocol_HeroesZi)
                ,
                scnAS15.injectClosed(
                        constantConcurrentUsers(users_flood_AS15).during(40000)
                ).protocols(httpProtocol_Otmena)
                ,
                scnAS19.injectClosed(
                        constantConcurrentUsers(users_flood_AS19).during(40000)
                ).protocols(httpProtocol_ProDEG)
                ,
                scnAS20.injectClosed(
                        constantConcurrentUsers(users_flood_AS20).during(40000)
                ).protocols(httpProtocol_Gosduma)
                ,
                scnAS23.injectClosed(
                        constantConcurrentUsers(users_flood_AS23).during(40000)
                ).protocols(httpProtocol_Search)

        );
    }
}