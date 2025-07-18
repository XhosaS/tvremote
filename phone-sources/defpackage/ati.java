package defpackage;

import android.support.v7.appcompat.R;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ati implements yjv {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ati(long j, ylb ylbVar, Map map, long j2, int i) {
        this.e = i;
        this.a = j;
        this.d = ylbVar;
        this.c = map;
        this.b = j2;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        float f;
        int i = this.e;
        if (i == 0) {
            bpq bpqVar = (bpq) obj;
            int i2 = atj.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (bpqVar.n() & 4294967295L));
            float fCo = 0.0f;
            if (!a.r(1, 0) && Float.intBitsToFloat((int) (4294967295L & bpqVar.n())) <= Float.intBitsToFloat((int) (bpqVar.n() >> 32))) {
                fCo = 0.0f + bpqVar.co(fIntBitsToFloat);
            }
            ?? r1 = this.c;
            float fCo2 = fCo / bpqVar.co(Float.intBitsToFloat((int) (bpqVar.n() >> 32)));
            float fFloatValue = ((Number) r1.a()).floatValue();
            float fMin = Math.min(fFloatValue, fCo2) + fFloatValue;
            if (fMin <= 1.0f) {
                f = fIntBitsToFloat;
                atj.b(bpqVar, fMin, 1.0f, this.a, f);
            } else {
                f = fIntBitsToFloat;
            }
            ?? r13 = this.d;
            atj.b(bpqVar, 0.0f, fFloatValue, this.b, f);
            r13.a(bpqVar);
            return ygi.a;
        }
        if (i == 1) {
            byu byuVar = (byu) obj;
            byuVar.r();
            Object obj2 = this.d;
            brx.G(byuVar, (bnn) this.c, this.a, this.b, 0.0f, (brx) obj2, 0, R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
            return ygi.a;
        }
        pwg pwgVar = (pwg) obj;
        pwgVar.getClass();
        vtw vtwVar = (vtw) pwgVar.a(5, null);
        vtwVar.x(pwgVar);
        vtwVar.getClass();
        pwh pwhVar = pwgVar.c;
        if (pwhVar == null) {
            pwhVar = pwh.a;
        }
        Object obj3 = this.d;
        long j = this.a;
        if (pwhVar.b < j) {
            long j2 = this.b;
            ((ylb) obj3).a = true;
            vtw vtwVarM = pwh.a.m();
            vtwVarM.getClass();
            ocv.be(j2, vtwVarM);
            ocv.bf(j, vtwVarM);
            pwh pwhVarBd = ocv.bd(vtwVarM);
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            pwg pwgVar2 = (pwg) vtwVar.b;
            pwgVar2.c = pwhVarBd;
            pwgVar2.b |= 1;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            pwh pwhVar2 = (pwh) DesugarCollections.unmodifiableMap(pwgVar.d).get(str);
            if (pwhVar2 == null) {
                pwhVar2 = pwh.a;
                pwhVar2.getClass();
            }
            if (pwhVar2.b < j) {
                ((ylb) obj3).a = true;
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pwg) vtwVar.b).d)).getClass();
                vtw vtwVarM2 = pwh.a.m();
                vtwVarM2.getClass();
                ocv.be(jLongValue, vtwVarM2);
                ocv.bf(j, vtwVarM2);
                pwh pwhVarBd2 = ocv.bd(vtwVarM2);
                str.getClass();
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                pwg pwgVar3 = (pwg) vtwVar.b;
                vve vveVar = pwgVar3.d;
                if (!vveVar.b) {
                    pwgVar3.d = vveVar.a();
                }
                pwgVar3.d.put(str, pwhVarBd2);
            }
        }
        vuc vucVarR = vtwVar.r();
        vucVarR.getClass();
        return (pwg) vucVarR;
    }

    public /* synthetic */ ati(Object obj, long j, long j2, Object obj2, int i) {
        this.e = i;
        this.c = obj;
        this.a = j;
        this.b = j2;
        this.d = obj2;
    }
}
