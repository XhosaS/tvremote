package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdv {
    public final String a;
    public final String b;
    public final String c;
    private final gmi d;
    private final gmk e;

    public rdv(Context context, String str, yqt yqtVar, yqt yqtVar2) {
        String packageName = context.getPackageName();
        gmi gmiVar = (gmi) ((yqz) yqtVar).a;
        gmk gmkVar = (gmk) ((yqz) yqtVar2).a;
        Boolean bool = false;
        bool.getClass();
        bool.getClass();
        this.c = str;
        this.d = gmiVar;
        this.e = gmkVar;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
        this.b = "com.google.android.client_error_logging#".concat(String.valueOf(packageName));
    }

    public final zyd a() {
        final zyd zydVarA = this.d.a();
        int i = yyk.e;
        final zyd zydVarH = zxn.h(zcg.b);
        final zyd zydVarA2 = this.e.a();
        return zxn.b(zydVarA, zydVarH, zydVarA2).a(new Callable() { // from class: rdu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rdt rdtVar = rdt.a;
                rds rdsVar = new rds();
                int i2 = rdsVar.b.memoizedSerializedSize & Integer.MIN_VALUE;
                zyd zydVar = zydVarA2;
                zyd zydVar2 = zydVarH;
                zyd zydVar3 = zydVarA;
                if (i2 == 0) {
                    rdsVar.y();
                }
                rdv rdvVar = this.a;
                rdt rdtVar2 = (rdt) rdsVar.b;
                rdtVar2.c |= 1;
                rdtVar2.d = rdvVar.c;
                rdsVar.a(rdvVar.a);
                rdsVar.a(rdvVar.b);
                if ((rdsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rdsVar.y();
                }
                rdt rdtVar3 = (rdt) rdsVar.b;
                rdtVar3.c |= 2;
                rdtVar3.e = false;
                if ((rdsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rdsVar.y();
                }
                rdt rdtVar4 = (rdt) rdsVar.b;
                rdtVar4.c |= 16;
                rdtVar4.i = false;
                try {
                    yqt yqtVar = (yqt) zxn.o(zydVar3);
                    if (yqtVar.g()) {
                        String str = (String) yqtVar.c();
                        if ((rdsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rdsVar.y();
                        }
                        rdt rdtVar5 = (rdt) rdsVar.b;
                        rdtVar5.c |= 8;
                        rdtVar5.g = str;
                    }
                } catch (Exception unused) {
                }
                try {
                    List list = (List) zxn.o(zydVar2);
                    if ((rdsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        rdsVar.y();
                    }
                    rdt rdtVar6 = (rdt) rdsVar.b;
                    abxj abxjVar = rdtVar6.h;
                    if (!abxjVar.c()) {
                        int size = abxjVar.size();
                        rdtVar6.h = abxjVar.d(size + size);
                    }
                    abus.m(list, rdtVar6.h);
                } catch (Exception unused2) {
                }
                try {
                    yqt yqtVar2 = (yqt) zxn.o(zydVar);
                    if (yqtVar2.g()) {
                        String str2 = (String) yqtVar2.c();
                        if ((Integer.MIN_VALUE & rdsVar.b.memoizedSerializedSize) == 0) {
                            rdsVar.y();
                        }
                        rdt rdtVar7 = (rdt) rdsVar.b;
                        rdtVar7.c |= 4;
                        rdtVar7.f = str2;
                    }
                } catch (Exception unused3) {
                }
                rdk rdkVar = rdk.a;
                rdj rdjVar = new rdj();
                rdjVar.f(rdt.b, (rdt) rdsVar.v());
                return (rdk) rdjVar.v();
            }
        }, zwk.a);
    }
}
