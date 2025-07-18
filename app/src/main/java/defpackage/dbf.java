package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
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
public class dbf implements daw {
    private final dgr a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public dbf(dgr dgrVar, int i) {
        this.a = dgrVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new czu("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new czu("In re-direct loop", -1, null);
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
                            this.d = new dpy(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new czu("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iB == -1) {
                        throw new czu("Http request failed", -1, null);
                    }
                    try {
                        throw new czu(this.c.getResponseMessage(), iB, null);
                    } catch (IOException e2) {
                        throw new czu("Failed to get a response message", iB, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new czu("Received empty or null redirect url", iB, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    d();
                    return e(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new czu("Bad redirect url: ".concat(String.valueOf(headerField)), iB, e3);
                }
            } catch (IOException e4) {
                throw new czu("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new czu("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.daw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.daw
    public final void cz() {
        this.e = true;
    }

    @Override // defpackage.daw
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

    @Override // defpackage.daw
    public final void f(cyn cynVar, dav davVar) {
        int i = dqf.a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dgr dgrVar = this.a;
                if (dgrVar.f == null) {
                    if (TextUtils.isEmpty(dgrVar.e)) {
                        String string = dgrVar.d;
                        if (TextUtils.isEmpty(string)) {
                            URL url = dgrVar.c;
                            dqk.d(url, "Argument must not be null");
                            string = url.toString();
                        }
                        dgrVar.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    dgrVar.f = new URL(dgrVar.e);
                }
                URL url2 = dgrVar.f;
                dgs dgsVar = dgrVar.b;
                if (((dgv) dgsVar).c == null) {
                    synchronized (dgsVar) {
                        if (((dgv) dgsVar).c == null) {
                            HashMap map = new HashMap();
                            for (Map.Entry entry : ((dgv) dgsVar).b.entrySet()) {
                                List list = (List) entry.getValue();
                                StringBuilder sb = new StringBuilder();
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    String str = ((dgu) list.get(i2)).a;
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append(str);
                                        if (i2 != list.size() - 1) {
                                            sb.append(',');
                                        }
                                    }
                                }
                                String string2 = sb.toString();
                                if (!TextUtils.isEmpty(string2)) {
                                    map.put((String) entry.getKey(), string2);
                                }
                            }
                            ((dgv) dgsVar).c = DesugarCollections.unmodifiableMap(map);
                        }
                    }
                }
                davVar.b(e(url2, 0, null, ((dgv) dgsVar).c));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                davVar.e(e);
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + dqf.a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // defpackage.daw
    public final int g() {
        return 2;
    }
}
