package defpackage;

import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoc extends agtu implements agux {
    Object a;
    Object b;
    int c;
    final /* synthetic */ aod d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoc(aod aodVar, Object obj, agsw agswVar) {
        super(1, agswVar);
        this.d = aodVar;
        this.e = obj;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new aoc(this.d, this.e, (agsw) obj).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.agto
    public final Object b(Object obj) throws Exception {
        ?? r1;
        Throwable th;
        Object obj2;
        agtg agtgVar = agtg.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    agpl.b(obj);
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        aguc.a(r1, th);
                        throw th3;
                    }
                }
            } else {
                agpl.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.d.a);
                Object obj3 = this.e;
                try {
                    apq apqVar = new apq(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    ((MessageLite) obj3).e(apqVar);
                    if (agpu.a == agtgVar) {
                        return agtgVar;
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
            aguc.a(r1, null);
            return agpu.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw anq.a(this.d.a.getParent(), e);
            }
            throw e;
        }
    }
}
