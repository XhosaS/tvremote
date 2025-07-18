package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wse implements wsb {
    public final agow a;
    public final String b;
    private final Boolean c;
    private final zyg d;
    private final wkr e;

    public wse(Context context, Boolean bool, agow agowVar, zyg zygVar, wkr wkrVar) {
        this.b = context.getPackageName();
        this.c = bool;
        this.a = agowVar;
        this.d = zygVar;
        this.e = wkrVar;
    }

    @Override // defpackage.wsb
    public final zyd a(final zyd zydVar, wnt wntVar, final long j) {
        final String str = wntVar.a.c;
        return !this.c.booleanValue() ? zxy.a : zuz.g(this.e.a(), wyo.a(new yqi() { // from class: wsc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                String str2 = str;
                this.a.c(zydVar, j, str2);
                return null;
            }
        }), this.d);
    }

    @Override // defpackage.wsb
    public final zyd b(final wnt wntVar) {
        return !this.c.booleanValue() ? zxy.a : zuz.g(this.e.a(), wyo.a(new yqi() { // from class: wsd
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                wnt wntVar2 = wntVar;
                wse wseVar = this.a;
                ((wky) wseVar.a.a()).a(wseVar.b, wntVar2.a.c, "attempt");
                return null;
            }
        }), this.d);
    }

    public final void c(zyd zydVar, double d, String str) {
        double d2;
        String str2;
        String str3;
        wky wkyVar = (wky) this.a.a();
        try {
            zxn.o(zydVar);
            str3 = this.b;
            wkyVar.a(str3, str, "success");
            d2 = d;
            str2 = str;
        } catch (CancellationException unused) {
            d2 = d;
            str2 = str;
        } catch (Exception unused2) {
            d2 = d;
            str2 = str;
        }
        try {
            wkyVar.b(d2, str3, str2, "success");
        } catch (CancellationException unused3) {
            String str4 = this.b;
            wkyVar.a(str4, str2, "cancellation");
            wkyVar.b(d2, str4, str2, "cancellation");
        } catch (Exception unused4) {
            String str5 = this.b;
            wkyVar.a(str5, str2, "failure");
            wkyVar.b(d2, str5, str2, "failure");
        }
    }
}
