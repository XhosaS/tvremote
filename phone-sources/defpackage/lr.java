package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lr extends ykt implements yjz {
    private final /* synthetic */ int r;
    public static final lr q = new lr(20);
    public static final lr p = new lr(19);
    public static final lr o = new lr(18);
    public static final lr n = new lr(17);
    public static final lr m = new lr(16);
    public static final lr l = new lr(15);
    public static final lr k = new lr(14);
    public static final lr j = new lr(13);
    public static final lr i = new lr(12);
    public static final lr h = new lr(11);
    public static final lr g = new lr(10);
    public static final lr f = new lr(9);
    public static final lr e = new lr(8);
    public static final lr d = new lr(3);
    public static final lr c = new lr(2);
    public static final lr b = new lr(1);
    public static final lr a = new lr(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(int i2) {
        super(2);
        this.r = i2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                lx lxVar = (lx) obj2;
                return Boolean.valueOf(((lx) obj) == lxVar && lxVar == lx.c);
            case 1:
                long j2 = ((cmh) obj).a;
                long j3 = ((cmh) obj2).a;
                Map map = qa.a;
                return fh.g(0.0f, 400.0f, new cmh(4294967297L), 1);
            case 2:
                String str = (String) obj;
                bkn bknVar = (bkn) obj2;
                if (str.length() == 0) {
                    return bknVar.toString();
                }
                return str + ", " + bknVar;
            case 3:
                return a.ay(obj, obj2);
            case 4:
                return bub.a(obj, obj2);
            case 5:
                return bub.a(obj, obj2);
            case 6:
                return bub.a(obj, obj2);
            case 7:
                return bub.a(obj, obj2);
            case 8:
                ((Number) obj2).intValue();
                ((bys) obj).as();
                return ygi.a;
            case 9:
                ((bys) obj).W((bvt) obj2);
                return ygi.a;
            case 10:
                ((bys) obj).X((bkp) obj2);
                return ygi.a;
            case 11:
                ((bys) obj).ay((bhu) obj2);
                return ygi.a;
            case 12:
                return a.ay(obj, obj2);
            case 13:
                return (bkx) obj;
            case 14:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                List listAn = yfm.an(list);
                listAn.addAll(list2);
                return listAn;
            case 15:
                return (blf) obj;
            case 16:
                return (ygi) obj;
            case 17:
                return (ygi) obj;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            default:
                return (ygi) obj;
        }
    }
}
