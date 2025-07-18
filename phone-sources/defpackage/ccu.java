package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccu extends ykt implements yjv {
    private final /* synthetic */ int q;
    public static final ccu p = new ccu(15);
    public static final ccu o = new ccu(14);
    public static final ccu n = new ccu(13);
    public static final ccu m = new ccu(12);
    public static final ccu l = new ccu(11);
    public static final ccu k = new ccu(10);
    public static final ccu j = new ccu(9);
    public static final ccu i = new ccu(8);
    public static final ccu h = new ccu(7);
    public static final ccu g = new ccu(6);
    public static final ccu f = new ccu(5);
    public static final ccu e = new ccu(4);
    public static final ccu d = new ccu(3);
    public static final ccu c = new ccu(2);
    public static final ccu b = new ccu(1);
    public static final ccu a = new ccu(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccu(int i2) {
        super(1);
        this.q = i2;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        switch (this.q) {
            case 0:
                return Boolean.valueOf(ccv.a(obj));
            case 1:
                bhu bhuVar = (bhu) obj;
                bcm.h(bhuVar, AndroidCompositionLocals_androidKt.a);
                return ((Context) bcm.h(bhuVar, AndroidCompositionLocals_androidKt.b)).getResources();
            case 2:
                return ygi.a;
            case 3:
                ((Number) obj).longValue();
                return ygi.a;
            case 4:
                return Integer.valueOf(((cer) obj).b);
            case 5:
                return Integer.valueOf(((cer) obj).c.a());
            case 6:
                cmv cmvVar = (cmv) obj;
                cmvVar.getHandler().post(new caw(cmvVar.q, 6));
                return ygi.a;
            case 7:
                return ygi.a;
            case 8:
                return ygi.a;
            case 9:
                return ygi.a;
            case 10:
                cfk.a((cfc) obj);
                return ygi.a;
            case 11:
                ((Number) obj).longValue();
                return ygi.a;
            case 12:
                return ygi.a;
            case 13:
                ymp[] ympVarArr = cfk.a;
                cfm cfmVar = cfi.v;
                ygi ygiVar = ygi.a;
                ((cfc) obj).e(cfmVar, ygiVar);
                return ygiVar;
            case 14:
                return ygi.a;
            default:
                cny cnyVar = (cny) obj;
                if (cnyVar.isAttachedToWindow()) {
                    cnyVar.m();
                }
                return ygi.a;
        }
    }
}
