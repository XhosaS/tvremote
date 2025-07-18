package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfh extends ykt implements yjz {
    private final /* synthetic */ int t;
    public static final cfh s = new cfh(18);
    public static final cfh r = new cfh(17);
    public static final cfh q = new cfh(16);
    public static final cfh p = new cfh(15);
    public static final cfh o = new cfh(14);
    public static final cfh n = new cfh(13);
    public static final cfh m = new cfh(12);
    public static final cfh l = new cfh(11);
    public static final cfh k = new cfh(10);
    public static final cfh j = new cfh(9);
    public static final cfh i = new cfh(8);
    public static final cfh h = new cfh(7);
    public static final cfh g = new cfh(6);
    public static final cfh f = new cfh(5);
    public static final cfh e = new cfh(4);
    public static final cfh d = new cfh(3);
    public static final cfh c = new cfh(2);
    public static final cfh b = new cfh(1);
    public static final cfh a = new cfh(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfh(int i2) {
        super(2);
        this.t = i2;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        int i2 = 1;
        switch (this.t) {
            case 0:
                cez cezVar = (cez) obj;
                int i3 = ((cez) obj2).a;
                return cezVar;
            case 1:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 2:
                return (bol) obj;
            case 3:
                return (String) obj;
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                List listAn = yfm.an(list);
                listAn.addAll(list2);
                return listAn;
            case 5:
                Float f2 = (Float) obj;
                ((Number) obj2).floatValue();
                return f2;
            case 6:
                return (String) obj;
            case 7:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 8:
                ces cesVar = (ces) obj;
                ces cesVar2 = (ces) obj2;
                if (cesVar == null || (str = cesVar.a) == null) {
                    str = cesVar2.a;
                }
                return new ces(str, cesVar != null ? cesVar.b : cesVar2.b);
            case 9:
                cfc cfcVar = ((cff) obj).c;
                cfm cfmVar = cfi.s;
                return Integer.valueOf(Float.compare(((Number) cfcVar.c(cfmVar, cco.t)).floatValue(), ((Number) ((cff) obj2).c.c(cfmVar, cco.u)).floatValue()));
            case 10:
                cmv cmvVarC = cna.c((bys) obj);
                cmvVarC.x = (yjv) obj2;
                cmvVarC.e = new cdq(cmvVarC, 8);
                cmvVarC.f = true;
                cmvVarC.q.a();
                return ygi.a;
            case 11:
                cmv cmvVarC2 = cna.c((bys) obj);
                cmvVarC2.y = (yjv) obj2;
                cmvVarC2.g = new cdq(cmvVarC2, 7);
                return ygi.a;
            case 12:
                bkp bkpVar = (bkp) obj2;
                cmv cmvVarC3 = cna.c((bys) obj);
                if (bkpVar != cmvVarC3.h) {
                    cmvVarC3.h = bkpVar;
                    yjv yjvVar = cmvVarC3.i;
                    if (yjvVar != null) {
                        yjvVar.a(bkpVar);
                    }
                }
                return ygi.a;
            case 13:
                clx clxVar = (clx) obj2;
                cmv cmvVarC4 = cna.c((bys) obj);
                if (clxVar != cmvVarC4.j) {
                    cmvVarC4.j = clxVar;
                    yjv yjvVar2 = cmvVarC4.k;
                    if (yjvVar2 != null) {
                        yjvVar2.a(clxVar);
                    }
                }
                return ygi.a;
            case 14:
                dvk dvkVar = (dvk) obj2;
                cmv cmvVarC5 = cna.c((bys) obj);
                if (dvkVar != cmvVarC5.l) {
                    cmvVarC5.l = dvkVar;
                    dwf.f(cmvVarC5, dvkVar);
                }
                return ygi.a;
            case 15:
                ghe gheVar = (ghe) obj2;
                cmv cmvVarC6 = cna.c((bys) obj);
                if (gheVar != cmvVarC6.m) {
                    cmvVarC6.m = gheVar;
                    gez.w(cmvVarC6, gheVar);
                }
                return ygi.a;
            case 16:
                cmv cmvVarC7 = cna.c((bys) obj);
                int iOrdinal = ((cmi) obj2).ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    throw new yfu();
                }
                cmvVarC7.setLayoutDirection(i2);
                return ygi.a;
            case 17:
                return a.ay(obj, obj2);
            default:
                return a.ay(obj, obj2);
        }
    }
}
