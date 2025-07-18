package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcb extends yiz implements yjv {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(dbz dbzVar, yih yihVar, int i) {
        super(1, yihVar);
        this.d = i;
        this.c = dbzVar;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        if (this.d != 0) {
            return new dcb((dbz) this.c, (yih) obj, 1).invokeSuspend(ygi.a);
        }
        return new dcb((dcc) this.c, (yih) obj, 0).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(yih yihVar) {
        return this.d != 0 ? new dcb((dbz) this.c, yihVar, 1) : new dcb((dcc) this.c, yihVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Exception {
        ?? r0;
        FileInputStream fileInputStream;
        ?? r2;
        Throwable th;
        FileInputStream fileInputStream2;
        Object obj2;
        dcq dckVar;
        if (this.d != 0) {
            yio yioVar = yio.a;
            int i = this.b;
            try {
            } catch (Throwable th2) {
                cvi cviVarM = ((dbz) this.c).m();
                this.a = th2;
                this.b = 2;
                Object objT = cviVarM.t();
                if (objT == yioVar) {
                    return yioVar;
                }
                obj2 = th2;
                obj = objT;
            }
            if (i == 0) {
                ybn.f(obj);
                Object obj3 = this.c;
                this.b = 1;
                obj = ((dbz) obj3).h(true, this);
                if (obj == yioVar) {
                    return yioVar;
                }
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    ybn.f(obj);
                    dckVar = new dck((Throwable) obj2, ((Number) obj).intValue());
                    return new yfw(dckVar, true);
                }
                ybn.f(obj);
            }
            dckVar = (dcq) obj;
            return new yfw(dckVar, true);
        }
        yio yioVar2 = yio.a;
        int i2 = this.b;
        try {
            try {
            } catch (FileNotFoundException unused) {
                Object obj4 = this.c;
                File file = ((dcc) obj4).a;
                if (!file.exists()) {
                    return ((dcc) this.c).b.a();
                }
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    dcn dcnVar = ((dcc) obj4).b;
                    this.a = fileInputStream3;
                    this.b = 2;
                    obj = dcnVar.b(fileInputStream3);
                    if (obj == yioVar2) {
                        return yioVar2;
                    }
                    fileInputStream = fileInputStream3;
                } catch (Throwable th3) {
                    th = th3;
                    r0 = fileInputStream3;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    r0 = this.a;
                    try {
                        ybn.f(obj);
                        fileInputStream = r0;
                        wef.v(fileInputStream, null);
                        return obj;
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                r2 = this.a;
                try {
                    ybn.f(obj);
                    fileInputStream2 = r2;
                    wef.v(fileInputStream2, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            ybn.f(obj);
            Object obj5 = this.c;
            FileInputStream fileInputStream4 = new FileInputStream(((dcc) obj5).a);
            try {
                dcn dcnVar2 = ((dcc) obj5).b;
                this.a = fileInputStream4;
                this.b = 1;
                Object objB = dcnVar2.b(fileInputStream4);
                if (objB == yioVar2) {
                    return yioVar2;
                }
                fileInputStream2 = fileInputStream4;
                obj = objB;
                wef.v(fileInputStream2, null);
                return obj;
            } catch (Throwable th6) {
                r2 = fileInputStream4;
                th = th6;
                throw th;
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw cwp.i(((dcc) this.c).a.getParent(), e);
            }
            throw e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(dcc dccVar, yih yihVar, int i) {
        super(1, yihVar);
        this.d = i;
        this.c = dccVar;
    }
}
