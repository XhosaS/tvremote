package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anr implements yjz {
    private final /* synthetic */ int u;
    public static final anr t = new anr(20);
    public static final anr s = new anr(19);
    public static final anr r = new anr(18);
    public static final anr q = new anr(17);
    public static final anr p = new anr(16);
    public static final anr o = new anr(15);
    public static final anr n = new anr(14);
    public static final anr m = new anr(13);
    public static final anr l = new anr(12);
    public static final anr k = new anr(10);
    public static final anr j = new anr(9);
    public static final anr i = new anr(8);
    public static final anr h = new anr(7);
    public static final anr g = new anr(6);
    public static final anr f = new anr(5);
    public static final anr e = new anr(4);
    public static final anr d = new anr(3);
    public static final anr c = new anr(2);
    public static final anr b = new anr(1);
    public static final anr a = new anr(0);

    public anr(int i2) {
        this.u = i2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.u) {
            case 0:
                return a.ax(obj, obj2);
            case 1:
                return a.ax(obj, obj2);
            case 2:
                return a.ay(obj, obj2);
            case 3:
                return a.ay(obj, obj2);
            case 4:
                return a.ay(obj, obj2);
            case 5:
                return a.ay(obj, obj2);
            case 6:
                return a.ay(obj, obj2);
            case 7:
                return a.ay(obj, obj2);
            case 8:
                bao baoVar = (bao) obj;
                ((Number) obj2).intValue();
                baoVar.x(-511854661);
                WeakHashMap weakHashMap = zs.a;
                yu yuVar = new yu(zy.j(baoVar).f, 48);
                baoVar.p();
                return yuVar;
            case 9:
                return a.ay(obj, obj2);
            case 10:
                return a.ay(obj, obj2);
            case 11:
                bao baoVar2 = (bao) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (baoVar2.L((iIntValue & 3) != 2, iIntValue & 1)) {
                    throw null;
                }
                baoVar2.t();
                return ygi.a;
            case 12:
                bao baoVar3 = (bao) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (baoVar3.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    apz.c(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, baoVar3, 6, 0);
                } else {
                    baoVar3.t();
                }
                return ygi.a;
            case 13:
                djg djgVar = (djg) obj2;
                return djgVar instanceof dsg ? djgVar : obj;
            case 14:
                return a.X(obj, (djg) obj2);
            case 15:
                return a.Y(obj, (djg) obj2);
            case 16:
                return a.X(obj, (djg) obj2);
            case 17:
                return a.Y(obj, (djg) obj2);
            case 18:
                return a.X(obj, (djg) obj2);
            case 19:
                return a.Y(obj, (djg) obj2);
            default:
                djg djgVar2 = (djg) obj2;
                return djgVar2 instanceof djx ? djgVar2 : obj;
        }
    }
}
