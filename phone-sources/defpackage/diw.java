package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class diw implements yjz {
    private final /* synthetic */ int a;

    public /* synthetic */ diw(int i) {
        this.a = i;
    }

    @Override // defpackage.yjz
    public final Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                djg djgVar = (djg) obj2;
                if (str.length() == 0) {
                    return djgVar.toString();
                }
                return str + ", " + djgVar;
            case 1:
                ((dja) obj).f = ((Integer) obj2).intValue();
                return ygi.a;
            case 2:
                ((djb) obj).b = (djl) obj2;
                return ygi.a;
            case 3:
                ((djb) obj).a = (djh) obj2;
                return ygi.a;
            case 4:
                ((djb) obj).d = ((drt) obj2).a;
                return ygi.a;
            case 5:
                djb djbVar = (djb) obj;
                if (((crn) obj2) != null) {
                    throw null;
                }
                djbVar.e = null;
                return ygi.a;
            case 6:
                ((djb) obj).c = (Float) obj2;
                return ygi.a;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                if (((djg) obj2) instanceof djp) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 8:
                dlc dlcVar = (dlc) obj;
                djg djgVar2 = (djg) obj2;
                return ((djgVar2 instanceof dsf) || (djgVar2 instanceof dry) || (djgVar2 instanceof dks) || (djgVar2 instanceof djy)) ? dlc.a(dlcVar, dlcVar.a.a(djgVar2), null, 2) : dlc.a(dlcVar, null, dlcVar.b.a(djgVar2), 1);
            case 9:
                ((dkz) obj).a = ((cmc) obj2).a;
                return ygi.a;
            case 10:
                ((dkz) obj).e = (dms) obj2;
                return ygi.a;
            case 11:
                ((dno) obj).e = ((Long) obj2).longValue();
                return ygi.a;
            case 12:
                ((dno) obj).a = (dro) obj2;
                return ygi.a;
            case 13:
                ((dnm) obj).a = (djh) obj2;
                return ygi.a;
            case 14:
                ((dnm) obj).e = ((drm) obj2).a;
                return ygi.a;
            case 15:
                ((dru) obj).a = (djh) obj2;
                return ygi.a;
            case 16:
                ((dru) obj).e = (dro) obj2;
                return ygi.a;
            case 17:
                ((drv) obj).a = (djh) obj2;
                return ygi.a;
            case 18:
                ((drv) obj).f = ((drm) obj2).a;
                return ygi.a;
            case 19:
                ((drv) obj).e = ((drn) obj2).a;
                return ygi.a;
            default:
                ((drw) obj).a = (djh) obj2;
                return ygi.a;
        }
    }
}
