package defpackage;

import android.net.Uri;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qza {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qza(int[] iArr, exi[] exiVarArr, int[] iArr2, int[][][] iArr3, exi exiVar) {
        this.b = iArr;
        this.c = exiVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = exiVar;
        this.a = iArr.length;
    }

    public static qza c(int i, String str, String str2, Locale locale, String str3, int i2, ieg iegVar, Uri uri) {
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendPath(str).appendQueryParameter("cr", str2);
        if (locale != null) {
            builderAppendQueryParameter.appendQueryParameter("lr", locale.toString());
        }
        builderAppendQueryParameter.appendQueryParameter("fmt", Integer.toString(i2));
        if (!TextUtils.isEmpty(str3)) {
            builderAppendQueryParameter.appendQueryParameter("ts", str3);
        }
        return new qza(i, builderAppendQueryParameter.build(), str2, locale, str, iegVar);
    }

    private final void h(gzu gzuVar, cvi cviVar) {
        gzu gzuVar2 = (gzu) this.d;
        if (gzuVar.a != gzuVar2.a) {
            throw new IllegalStateException(a.cj(cviVar, "Interceptor '", "' cannot modify the request's context."));
        }
        if (gzuVar.b == gzw.a) {
            throw new IllegalStateException(a.cj(cviVar, "Interceptor '", "' cannot set the request's data to null."));
        }
        if (gzuVar.c != gzuVar2.c) {
            throw new IllegalStateException(a.cj(cviVar, "Interceptor '", "' cannot modify the request's target."));
        }
        if (gzuVar.t != gzuVar2.t) {
            throw new IllegalStateException(a.cj(cviVar, "Interceptor '", "' cannot modify the request's lifecycle."));
        }
        if (gzuVar.u != gzuVar2.u) {
            throw new IllegalStateException(a.cj(cviVar, "Interceptor '", "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead."));
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, yjk] */
    public final vqs a(vou vouVar, boolean z, Map map, qyn qynVar) {
        qva qvaVar;
        map.getClass();
        qzb qzbVar = (qzb) map.get(vouVar.c);
        if (qzbVar != null) {
            ofa ofaVar = qzbVar.a;
            vun vunVar = ofaVar.c;
            vunVar.getClass();
            Iterator<E> it = vunVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    qvaVar = null;
                    break;
                }
                qva qvaVarA = qva.a(ofaVar.b, (ofi) it.next());
                if (qvaVarA != null) {
                    qvaVar = qvaVarA;
                    break;
                }
            }
            if (qvaVar != null) {
                vrp vrpVar = qzbVar.b;
                ((vrs) this.c).c(vrpVar, new abh(this, qvaVar, z, qynVar, 4));
                vra vraVar = new vra(new vpv(1));
                ofi ofiVar = qvaVar.b;
                String str = ofiVar.c;
                str.getClass();
                vqe vqeVar = new vqe(str);
                vro vroVar = vro.ON_ERROR_CONTAINER;
                vql vqlVar = new vql(vqeVar, vroVar, 1, null);
                String str2 = ofiVar.d;
                str2.getClass();
                vrb vrbVar = new vrb(new vql(new vqe(str2), vroVar, 3, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)));
                String str3 = ofiVar.e;
                str3.getClass();
                vqe vqeVar2 = new vqe(str3);
                String str4 = ofiVar.f;
                str4.getClass();
                vrd vrdVar = new vrd(vraVar, vqlVar, null, vrbVar, null, new vpn(yfm.s(vqeVar2, new vqe(str4)), vrpVar, 109339, vro.ON_ERROR, new vpk(vro.ERROR)), null, 1, 1, 692);
                int i = this.a;
                ?? r13 = this.e;
                Integer numValueOf = Integer.valueOf(i);
                vro vroVar2 = vro.CRITICAL_ALERT_BACKGROUND_COLOR;
                ((qze) r13).a = new qyw(qzbVar, this, 0);
                return new vqs(vrdVar, numValueOf, vroVar2, vrpVar, (yjk) r13, true != z ? 109736 : 109340, 64);
            }
        }
        return null;
    }

    public final String b() {
        return ((String) this.e) + ".1." + ((String) this.f) + "." + String.valueOf(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [gwj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.gzu r12, defpackage.yih r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.gyu
            if (r0 == 0) goto L13
            r0 = r13
            gyu r0 = (defpackage.gyu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gyu r0 = new gyu
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cvi r12 = r0.d
            defpackage.ybn.f(r13)
            goto L6c
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.ybn.f(r13)
            int r13 = r11.a
            if (r13 <= 0) goto L45
            java.lang.Object r2 = r11.e
            int r4 = r13 + (-1)
            java.lang.Object r2 = r2.get(r4)
            cvi r2 = (defpackage.cvi) r2
            r11.h(r12, r2)
        L45:
            java.lang.Object r6 = r11.e
            java.lang.Object r2 = r6.get(r13)
            cvi r2 = (defpackage.cvi) r2
            int r7 = r13 + 1
            java.lang.Object r13 = r11.c
            java.lang.Object r4 = r11.d
            java.lang.Object r10 = r11.f
            r5 = r4
            qza r4 = new qza
            gzu r5 = (defpackage.gzu) r5
            r9 = r13
            haj r9 = (defpackage.haj) r9
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.d = r2
            r0.b = r3
            java.lang.Object r13 = r2.z(r4, r0)
            if (r13 == r1) goto L76
            r12 = r2
        L6c:
            gzv r13 = (defpackage.gzv) r13
            gzu r0 = r13.a()
            r11.h(r0, r12)
            return r13
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qza.d(gzu, yih):java.lang.Object");
    }

    public final int e(int i) {
        return ((int[]) this.b)[i];
    }

    public final int f(int i, int i2, int i3) {
        return clw.L(((int[][][]) this.e)[i][i2][i3]);
    }

    public final exi g(int i) {
        return ((exi[]) this.c)[i];
    }

    public qza(gzu gzuVar, List list, int i, gzu gzuVar2, haj hajVar, gwj gwjVar) {
        gzuVar.getClass();
        list.getClass();
        gzuVar2.getClass();
        hajVar.getClass();
        gwjVar.getClass();
        this.d = gzuVar;
        this.e = list;
        this.a = i;
        this.b = gzuVar2;
        this.c = hajVar;
        this.f = gwjVar;
    }

    private qza(int i, Uri uri, String str, Locale locale, String str2, ieg iegVar) {
        this.a = i;
        this.f = str;
        this.c = locale;
        this.e = str2;
        this.d = ksn.c(iegVar);
        this.b = uri;
    }

    public qza(ofj ofjVar, vrs vrsVar, xzg xzgVar, xwk xwkVar) {
        this.b = ofjVar;
        this.c = vrsVar;
        this.d = xzgVar;
        this.f = xwkVar;
        int i = vqy.a;
        this.a = vqy.a();
        this.e = new qze();
    }
}
