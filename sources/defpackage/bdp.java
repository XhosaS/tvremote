package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdp {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final byo d;
    public final byo e;
    public final byo f;
    public final byo g;
    public final byo h;
    public final Uri i;
    public volatile bbr j;
    public final Uri k;
    public volatile bbt l;

    public bdp(Context context, final byo byoVar, byo byoVar2, byo byoVar3) {
        this.c = context;
        this.e = byoVar;
        this.d = byoVar3;
        this.f = byoVar2;
        Pattern pattern = beq.a;
        bep bepVar = new bep(context);
        bepVar.c("phenotype_storage_info");
        bepVar.d("storage-info.pb");
        this.i = bepVar.a();
        bep bepVar2 = new bep(context);
        bepVar2.c("phenotype_storage_info");
        bepVar2.d("device-encrypted-storage-info.pb");
        int i = apr.a;
        bepVar2.b();
        this.k = bepVar2.a();
        this.g = bit.k(new asf(this, 20));
        this.h = bit.k(new byo() { // from class: bdo
            @Override // defpackage.byo
            public final Object aL() {
                cjd cjdVar = (cjd) byoVar.aL();
                cjdVar.getClass();
                return cjdVar.schedule(new bdb(2), 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    public final bbr a() {
        bbr bbrVar;
        bbr bbrVar2 = this.j;
        if (bbrVar2 != null) {
            return bbrVar2;
        }
        synchronized (a) {
            bbrVar = this.j;
            if (bbrVar == null) {
                bbrVar = bbr.b;
                if (apr.g(this.c)) {
                    bfd bfdVarB = bfd.b(bbrVar);
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        bbr bbrVar3 = (bbr) ((bzt) this.f.aL()).g(this.i, bfdVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        bbrVar = bbrVar3;
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                    this.j = bbrVar;
                }
            }
        }
        return bbrVar;
    }

    public final bbt b() {
        bbt bbtVar;
        bbt bbtVar2 = this.l;
        if (bbtVar2 != null) {
            return bbtVar2;
        }
        synchronized (b) {
            bbtVar = this.l;
            if (bbtVar == null) {
                bbtVar = bbt.b;
                bfd bfdVarB = bfd.b(bbtVar);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        bbt bbtVar3 = (bbt) ((bzt) this.f.aL()).g(this.k, bfdVarB);
                        StrictMode.setThreadPolicy(threadPolicy);
                        bbtVar = bbtVar3;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (IOException unused) {
                }
                this.l = bbtVar;
            }
        }
        return bbtVar;
    }

    public final bdh c(boolean z) {
        boolean z2;
        bzs bzsVarO;
        ckv ckvVar;
        String str;
        bzs bzsVarO2;
        bzs bzsVarO3;
        int i;
        boolean z3;
        boolean z4;
        String str2 = "";
        if (z) {
            bbt bbtVarB = b();
            z2 = bbtVarB.e;
            bzsVarO = bzs.o(new cmc(bbtVarB.i, bbt.a));
            ckvVar = bbtVarB.d;
            str = bbtVarB.f;
            bzsVarO2 = bzs.o(bbtVarB.g);
            bzsVarO3 = bzs.o(bbtVarB.h);
            if ((bbtVarB.c & 8) != 0) {
                bbu bbuVar = bbtVarB.j;
                if (bbuVar == null) {
                    bbuVar = bbu.a;
                }
                if (bbuVar.c == Build.VERSION.SDK_INT) {
                    bbu bbuVar2 = bbtVarB.j;
                    if (bbuVar2 == null) {
                        bbuVar2 = bbu.a;
                    }
                    str2 = bbuVar2.b;
                }
            }
            i = bbtVarB.c & 1;
            z3 = bbtVarB.l;
            z4 = bbtVarB.k;
        } else {
            bbr bbrVarA = a();
            z2 = bbrVarA.e;
            bzsVarO = bzs.o(new cmc(bbrVarA.j, bbr.a));
            ckvVar = bbrVarA.d;
            str = bbrVarA.f;
            bzsVarO2 = bzs.o(bbrVarA.h);
            bzsVarO3 = bzs.o(bbrVarA.i);
            if ((bbrVarA.c & 16) != 0) {
                bbu bbuVar3 = bbrVarA.k;
                if (bbuVar3 == null) {
                    bbuVar3 = bbu.a;
                }
                if (bbuVar3.c == Build.VERSION.SDK_INT) {
                    bbu bbuVar4 = bbrVarA.k;
                    if (bbuVar4 == null) {
                        bbuVar4 = bbu.a;
                    }
                    str2 = bbuVar4.b;
                }
            }
            i = bbrVarA.c & 1;
            z3 = bbrVarA.m;
            z4 = bbrVarA.l;
        }
        return new bdh(z2, bzsVarO, ckvVar, str, str2, bzsVarO2, bzsVarO3, 1 == i, z3, z4);
    }
}
