package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvi {
    public static final Duration a;
    public static final List b;
    public static final String c;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
        List listD = agqq.d("https://www.googleapis.com/auth/googlenow", "https://www.googleapis.com/auth/tv.house", "https://www.googleapis.com/auth/youtube", "https://www.googleapis.com/auth/connected-device-registration", "https://www.googleapis.com/auth/gcm", "https://www.googleapis.com/auth/assistant-sdk-certified", "https://www.googleapis.com/auth/cclog", "https://www.googleapis.com/auth/androidathome", "https://www.googleapis.com/auth/homegraph");
        b = listD;
        c = "oauth2:".concat(agqq.G(listD, " ", null, null, null, 62));
    }
}
