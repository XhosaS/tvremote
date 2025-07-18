package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmd implements hlu {
    private final hpw a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public hmd(hpw hpwVar, int i) {
        this.a = hpwVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new hkx("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new hkx("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iB = b(this.c);
                int i3 = iB / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new hwe(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new hkx("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iB == -1) {
                        throw new hkx("Http request failed", -1);
                    }
                    try {
                        throw new hkx(this.c.getResponseMessage(), iB);
                    } catch (IOException e2) {
                        throw new hkx("Failed to get a response message", iB, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new hkx("Received empty or null redirect url", iB);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    d();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new hkx("Bad redirect url: ".concat(String.valueOf(headerField)), iB, e3);
                }
            } catch (IOException e4) {
                throw new hkx("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new hkx("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.hlu
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.hlu
    public final void d() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.hlu
    public final void dL() {
        this.e = true;
    }

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        double d = hwk.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            hpw hpwVar = this.a;
            if (hpwVar.f == null) {
                if (TextUtils.isEmpty(hpwVar.e)) {
                    String string = hpwVar.d;
                    if (TextUtils.isEmpty(string)) {
                        URL url = hpwVar.c;
                        hju.p(url);
                        string = url.toString();
                    }
                    hpwVar.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
                }
                hpwVar.f = new URL(hpwVar.e);
            }
            URL url2 = hpwVar.f;
            hpx hpxVar = hpwVar.b;
            if (((hqa) hpxVar).c == null) {
                synchronized (hpxVar) {
                    if (((hqa) hpxVar).c == null) {
                        HashMap map = new HashMap();
                        for (Map.Entry entry : ((hqa) hpxVar).b.entrySet()) {
                            List list = (List) entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String str = ((hpz) list.get(i)).a;
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append(str);
                                    if (i != list.size() - 1) {
                                        sb.append(',');
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            if (!TextUtils.isEmpty(string2)) {
                                map.put((String) entry.getKey(), string2);
                            }
                        }
                        ((hqa) hpxVar).c = DesugarCollections.unmodifiableMap(map);
                    }
                }
            }
            hltVar.b(e(url2, 0, null, ((hqa) hpxVar).c));
        } catch (IOException e) {
            hltVar.e(e);
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 2;
    }
}
