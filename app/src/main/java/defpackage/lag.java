package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lag extends lht {
    public lag(lih lihVar) {
        super(lihVar);
    }

    public final void a(ksx ksxVar, Map map, lad ladVar) {
        lag lagVar;
        g();
        ag();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) kzg.f.a(null)).encodedAuthority((String) kzg.g.a(null)).path("config/app/".concat(String.valueOf(ksxVar.y()))).appendQueryParameter("platform", "android");
        kts ktsVar = this.m.j.y.d.y.c;
        builderAppendQueryParameter.appendQueryParameter("gmp_version", "129017").appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            lbk lbkVar = this.y;
            lbh lbhVar = lbkVar.g;
            lbkVar.o(lbhVar);
            lagVar = this;
            try {
                lbhVar.f(new laf(lagVar, ksxVar.t(), url, null, map, ladVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                lbk lbkVar2 = lagVar.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.c.c("Failed to parse config URL. Not fetching. appId", lab.b(ksxVar.t()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            lagVar = this;
        }
    }

    public final void c(String str, lhu lhuVar, llc llcVar, lad ladVar) {
        IOException iOException;
        int i;
        int iA;
        g();
        ag();
        try {
            try {
                URL url = new URI(lhuVar.a).toURL();
                af();
                try {
                    i = llcVar.memoizedSerializedSize;
                } catch (IOException e) {
                    iOException = e;
                }
                try {
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(llcVar.getClass()).a(llcVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(llcVar.getClass()).a(llcVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            llcVar.memoizedSerializedSize = (Integer.MIN_VALUE & llcVar.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(llcVar.getClass()).m(llcVar, abwa.a(abvwVar));
                    abvwVar.K();
                    lbk lbkVar = this.y;
                    lbh lbhVar = lbkVar.g;
                    lbkVar.o(lbhVar);
                    lbhVar.f(new laf(this, str, url, bArr, lhuVar.a(), ladVar));
                } catch (IOException e2) {
                    iOException = e2;
                    throw new RuntimeException(a.C(llcVar, "byte array"), iOException);
                }
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                lbk lbkVar2 = this.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.c.c("Failed to parse URL. Not uploading MeasurementBatch. appId", lab.b(str), lhuVar.a);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            lbk lbkVar22 = this.y;
            lab labVar2 = lbkVar22.f;
            lbkVar22.o(labVar2);
            labVar2.c.c("Failed to parse URL. Not uploading MeasurementBatch. appId", lab.b(str), lhuVar.a);
        }
    }

    public final boolean d() {
        ag();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.y.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.lht
    protected final void b() {
    }
}
