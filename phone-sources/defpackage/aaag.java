package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aaag implements aaat {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaag(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aaat
    public final void a() throws IOException {
        List<String> list;
        int i = this.b;
        int i2 = 1;
        if (i == 0) {
            aaai aaaiVar = (aaai) this.a;
            if (aaaiVar.i == null) {
                aaas aaasVar = aaaiVar.k;
                aaasVar.l = 10;
                HttpURLConnection httpURLConnection = aaaiVar.h;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                aaasVar.l = 12;
                aaaiVar.j = httpURLConnection.getOutputStream();
                aaaiVar.i = Channels.newChannel(aaaiVar.j);
            }
            aaaiVar.a.set(0);
            aaaiVar.b();
            return;
        }
        Network network = null;
        if (i == 1) {
            Object obj = this.a;
            aaai aaaiVar2 = (aaai) obj;
            aaaiVar2.c.read((UploadDataSink) obj, aaaiVar2.d);
            aaaiVar2.b.execute(new xyp(obj, 18, null));
            return;
        }
        if (i == 2) {
            ((UploadDataProvider) this.a).close();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                aaaq aaaqVar = (aaaq) this.a;
                aaas aaasVar2 = aaaqVar.d;
                if (aaasVar2.g.compareAndSet(1, 4)) {
                    aaaqVar.a.onResponseStarted(aaasVar2, aaasVar2.o);
                    return;
                }
                return;
            }
            aaas aaasVar3 = (aaas) this.a;
            if (aaasVar3.q == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String headerField = "http/1.1";
            int i3 = 0;
            while (true) {
                String headerFieldKey = aaasVar3.q.getHeaderFieldKey(i3);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    headerField = aaasVar3.q.getHeaderField(i3);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, aaasVar3.q.getHeaderField(i3)));
                }
                i3++;
            }
            int responseCode = aaasVar3.q.getResponseCode();
            aaba aabaVar = new aaba(new ArrayList(aaasVar3.f), responseCode, aaasVar3.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), headerField);
            if (responseCode >= 300 && responseCode < 400 && (list = aabaVar.getAllHeaders().get("location")) != null) {
                aaasVar3.j(1, 2, new aaao(aaasVar3, list.get(0), aabaVar, i2));
                return;
            }
            aaasVar3.o = aabaVar;
            aaasVar3.e();
            if (responseCode < 400) {
                aaasVar3.n = aaac.a(aaasVar3.q.getInputStream());
                aaasVar3.b.d();
                return;
            } else {
                InputStream errorStream = aaasVar3.q.getErrorStream();
                aaasVar3.n = errorStream != null ? aaac.a(errorStream) : null;
                aaasVar3.b.d();
                return;
            }
        }
        aaas aaasVar4 = (aaas) this.a;
        if (aaasVar4.g.get() == 8) {
            return;
        }
        URL url = new URL(aaasVar4.m);
        HttpURLConnection httpURLConnection2 = aaasVar4.q;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
            aaasVar4.q = null;
        }
        long j = aaasVar4.u;
        if (j == -1) {
            aaasVar4.q = (HttpURLConnection) url.openConnection();
        } else {
            Network[] allNetworks = ((ConnectivityManager) aaasVar4.r.d.getSystemService("connectivity")).getAllNetworks();
            int length = allNetworks.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                Network network2 = allNetworks[i4];
                if (network2.getNetworkHandle() == j) {
                    network = network2;
                    break;
                }
                i4++;
            }
            if (network == null) {
                throw new aaav();
            }
            aaasVar4.q = (HttpURLConnection) network.openConnection(url);
        }
        aaasVar4.q.setInstanceFollowRedirects(false);
        Map map = aaasVar4.e;
        if (!map.containsKey("User-Agent")) {
            map.put("User-Agent", aaasVar4.d);
        }
        for (Map.Entry entry : map.entrySet()) {
            aaasVar4.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        aaasVar4.q.setRequestMethod(aaasVar4.i);
        aabd aabdVar = aaasVar4.j;
        if (aabdVar != null) {
            aaasVar4.y = new aaai(aaasVar4, aaasVar4.k, aaasVar4.c, aaasVar4.q, aabdVar);
            aaai aaaiVar3 = aaasVar4.y;
            aaaiVar3.a(new aaah(aaaiVar3, aaasVar4.f.size() == 1, 1), "start");
        } else {
            aaasVar4.l = 10;
            aaasVar4.q.connect();
            aaasVar4.g();
        }
    }
}
