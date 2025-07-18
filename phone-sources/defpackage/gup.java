package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gup implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gup(ijn ijnVar, List list, int i) {
        this.c = i;
        this.b = ijnVar;
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws Exception {
        ghi ghiVarA;
        gpx gpxVarAB = null;
        switch (this.c) {
            case 0:
                gic gicVar = (gic) obj;
                gicVar.getClass();
                ((gur) this.a).a.e(gicVar, this.b);
                return ygi.a;
            case 1:
                return fse.s((String) this.b, (String) this.a, (gic) obj);
            case 2:
                return fse.u((String) this.b, (String) this.a, (gic) obj);
            case 3:
                return fse.u((String) this.b, (String) this.a, (gic) obj);
            case 4:
                gic gicVar2 = (gic) obj;
                gicVar2.getClass();
                ghiVarA = gicVar2.a((String) this.b);
                try {
                    ghiVarA.i(1, (String) this.a);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList.add(new guu(ghiVarA.d(0), fki.aB((int) ghiVarA.b(1))));
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                return fse.s((String) this.b, (String) this.a, (gic) obj);
            case 6:
                gic gicVar3 = (gic) obj;
                gicVar3.getClass();
                ((gvf) this.a).b.c(gicVar3, this.b);
                return ygi.a;
            case 7:
                return Integer.valueOf(fse.v((String) this.b, (String) this.a, (gic) obj));
            case 8:
                return fse.u((String) this.b, (String) this.a, (gic) obj);
            case 9:
                gic gicVar4 = (gic) obj;
                gicVar4.getClass();
                ghiVarA = gicVar4.a((String) this.b);
                try {
                    ghiVarA.i(1, (String) this.a);
                    ArrayList arrayList2 = new ArrayList();
                    while (ghiVarA.l()) {
                        byte[] bArrM = ghiVarA.m(0);
                        gox goxVar = gox.a;
                        arrayList2.add(gli.w(bArrM));
                    }
                    return arrayList2;
                } finally {
                }
            case 10:
                return Integer.valueOf(fse.v((String) this.b, (String) this.a, (gic) obj));
            case 11:
                return fse.s((String) this.b, (String) this.a, (gic) obj);
            case 12:
                return Integer.valueOf(fse.v((String) this.b, (String) this.a, (gic) obj));
            case 13:
                ir irVar = (ir) obj;
                irVar.getClass();
                ((gvf) this.a).D((gic) this.b, irVar);
                return ygi.a;
            case 14:
                ir irVar2 = (ir) obj;
                irVar2.getClass();
                ((gvf) this.a).E((gic) this.b, irVar2);
                return ygi.a;
            case 15:
                gic gicVar5 = (gic) obj;
                gicVar5.getClass();
                ghiVarA = gicVar5.a((String) this.b);
                try {
                    ghiVarA.i(1, (String) this.a);
                    if (ghiVarA.l()) {
                        Integer numValueOf = ghiVarA.k(0) ? null : Integer.valueOf((int) ghiVarA.b(0));
                        if (numValueOf != null) {
                            gpxVarAB = fki.aB(numValueOf.intValue());
                        }
                    }
                    return gpxVarAB;
                } finally {
                }
            case 16:
                gic gicVar6 = (gic) obj;
                gicVar6.getClass();
                ((gvf) this.a).a.e(gicVar6, this.b);
                return ygi.a;
            case 17:
                return fse.u((String) this.b, (String) this.a, (gic) obj);
            case 18:
                return fse.s((String) this.b, (String) this.a, (gic) obj);
            case 19:
                gic gicVar7 = (gic) obj;
                gicVar7.getClass();
                ((gvi) this.a).b.e(gicVar7, this.b);
                return ygi.a;
            default:
                gic gicVar8 = (gic) obj;
                gicVar8.getClass();
                gei geiVar = ((ijn) this.b).c;
                ?? r1 = this.a;
                ghi ghiVarA2 = gicVar8.a("INSERT OR REPLACE INTO `cache_domain` (`cache_id`,`domain`) VALUES (?,?)");
                try {
                    for (Object obj2 : r1) {
                        if (obj2 != null) {
                            geiVar.b(ghiVarA2, obj2);
                            ghiVarA2.l();
                            ghiVarA2.j();
                        }
                    }
                    wef.r(ghiVarA2, null);
                    return ygi.a;
                } finally {
                }
        }
    }

    public /* synthetic */ gup(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ gup(String str, int i) {
        this.c = i;
        this.b = "SELECT name FROM workname WHERE work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, byte[] bArr) {
        this.c = i;
        this.b = "DELETE from WorkProgress where work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, char[] cArr) {
        this.c = i;
        this.b = "DELETE FROM workspec WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, float[] fArr) {
        this.c = i;
        this.b = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, int[] iArr) {
        this.c = i;
        this.b = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, short[] sArr) {
        this.c = i;
        this.b = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, boolean[] zArr) {
        this.c = i;
        this.b = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, byte[][] bArr) {
        this.c = i;
        this.b = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, char[][] cArr) {
        this.c = i;
        this.b = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, float[][] fArr) {
        this.c = i;
        this.b = "DELETE FROM worktag WHERE work_spec_id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, int[][] iArr) {
        this.c = i;
        this.b = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, short[][] sArr) {
        this.c = i;
        this.b = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, boolean[][] zArr) {
        this.c = i;
        this.b = "SELECT state FROM workspec WHERE id=?";
        this.a = str;
    }

    public /* synthetic */ gup(String str, int i, byte[][][] bArr) {
        this.c = i;
        this.b = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        this.a = str;
    }
}
