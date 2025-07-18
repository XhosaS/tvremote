package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmf extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int A;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    int B;

    @eau(a = eav.NONE)
    @eat(a = 6)
    List a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Drawable b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Float c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Float d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Float e;

    @eau(a = eav.COLOR)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Integer f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String r;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float s;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Float t;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Float u;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float v;

    @eau(a = eav.COLOR)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Integer w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int z;

    private mmf() {
        super("Container");
    }

    public static mme aA(dru druVar) {
        return new mme(druVar, new mmf());
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        dro droVarB;
        int i = this.B;
        List list = this.a;
        ocd ocdVar = (ocd) druVar.g(ocd.class);
        int i2 = i - 1;
        Drawable drawable = this.b;
        Integer num = this.f;
        int i3 = this.y;
        int i4 = this.A;
        int i5 = this.z;
        int i6 = this.x;
        Integer num2 = this.w;
        float f = this.v;
        float f2 = this.s;
        Float f3 = this.t;
        Float f4 = this.u;
        String str = this.r;
        Float f5 = this.d;
        Float f6 = this.e;
        Float f7 = this.c;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            drg drgVarB = drh.b(druVar);
            drgVarB.a.b = true;
            droVarB = drgVarB;
        } else if (i2 == 2) {
            droVarB = dxn.b(druVar);
        } else if (i2 != 3) {
            droVarB = drh.b(druVar);
        } else {
            dxm dxmVarB = dxn.b(druVar);
            dxmVarB.aa();
            droVarB = dxmVarB;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                droVarB.e(((drq) it.next()).l());
            }
        }
        if (i3 != 0) {
            droVarB.c(i3);
        }
        if (i4 != 0) {
            droVarB.g(i4);
        }
        if (i5 != 0) {
            droVarB.f(i5);
        }
        if (i6 != 0) {
            droVarB.b(i6);
        }
        if (f5 != null) {
            droVarB.h(1, f5.floatValue());
        }
        if (f6 != null) {
            droVarB.h(2, f6.floatValue());
        }
        if (f7 != null) {
            droVarB.h(3, f7.floatValue());
        }
        if (str != null && ocdVar != null) {
            ocdVar.c = str;
        }
        if (drawable != null) {
            droVarB.n(drawable);
        } else if (num != null) {
            mwe mweVar = new mwe();
            mweVar.a = num.intValue();
            mweVar.b = 0;
            droVarB.n(mweVar);
        }
        if (f <= 0.5f) {
            return droVarB.a();
        }
        drg drgVarB2 = drh.b(druVar);
        drgVarB2.e(droVarB.a());
        efc efcVar = new efc(druVar, new efd());
        int iIntValue = num2 != null ? num2.intValue() : 922746880;
        efd efdVar = efcVar.a;
        efdVar.f = iIntValue;
        efdVar.d = 50331648;
        efdVar.a = f2;
        efdVar.e = f;
        efcVar.U(3);
        efcVar.T(9, 0);
        if (f3 == null && f4 == null) {
            double d = f;
            drgVarB2.Q(7, (int) Math.ceil(d));
            drgVarB2.Q(2, (int) Math.ceil(f / 2.0f));
            drgVarB2.Q(4, (int) Math.ceil(d * 1.5d));
        } else {
            float fFloatValue = f3 == null ? 0.0f : f3.floatValue();
            float fFloatValue2 = f4 != null ? f4.floatValue() : 0.0f;
            drgVarB2.Q(1, efe.b(f, fFloatValue));
            drgVarB2.Q(3, efe.c(f, fFloatValue));
            drgVarB2.Q(2, efe.d(f, fFloatValue2));
            drgVarB2.Q(4, efe.a(f, fFloatValue2));
            efdVar.b = fFloatValue;
            efdVar.c = fFloatValue2;
        }
        drg drgVarB3 = drh.b(druVar);
        drgVarB3.e(drgVarB2.a);
        drgVarB3.e(efdVar);
        return drgVarB3.a;
    }
}
