package defpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dci extends yiz implements yjv {
    Object a;
    Object b;
    int c;
    final /* synthetic */ Object d;
    final /* synthetic */ dcc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dci(dcc dccVar, Object obj, yih yihVar) {
        super(1, yihVar);
        this.e = dccVar;
        this.d = obj;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new dci(this.e, this.d, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new dci(this.e, this.d, yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) throws Exception {
        ?? r1;
        Throwable th;
        Object obj2;
        yio yioVar = yio.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    ybn.f(obj);
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        wef.v(r1, th);
                        throw th3;
                    }
                }
            } else {
                ybn.f(obj);
                dcc dccVar = this.e;
                FileOutputStream fileOutputStream = new FileOutputStream(dccVar.a);
                Object obj3 = this.d;
                try {
                    dcn dcnVar = dccVar.b;
                    dct dctVar = new dct(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    if (dcnVar.c(obj3, dctVar) == yioVar) {
                        return yioVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            wef.v(r1, null);
            return ygi.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw cwp.i(this.e.a.getParent(), e);
            }
            throw e;
        }
    }
}
