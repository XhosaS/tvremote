package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpi {
    public final zyg a;
    public final wmy b;

    public vpi(zyg zygVar, wmy wmyVar) {
        this.a = zygVar;
        this.b = wmyVar;
    }

    final zyd a(final File file) {
        return this.a.eN(wyo.i(new Callable() { // from class: vpg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                File file2 = file;
                if (!file2.exists()) {
                    return null;
                }
                zkr zkrVar = zkt.a;
                final zjb zjbVar = new zjb(zkrVar, zkrVar);
                final yzq yzqVarN = yzq.n(new zdd(file2));
                zdl it = yzqVarN.iterator();
                while (it.hasNext()) {
                    zkt.a((File) it.next());
                }
                boolean zDelete = true;
                for (File file3 : new Iterable() { // from class: zja
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        zjc zjcVar = new zjc();
                        zdl it2 = yzqVarN.iterator();
                        ArrayDeque arrayDeque = new ArrayDeque();
                        ArrayDeque arrayDeque2 = new ArrayDeque();
                        arrayDeque2.add(it2);
                        return new zjd(zjcVar, arrayDeque2, arrayDeque);
                    }
                }) {
                    if (!file2.equals(file3) && file3.exists()) {
                        file3.setWritable(true, true);
                        zDelete &= file3.delete();
                    }
                }
                if (zDelete && file2.setWritable(false, false) && file2.list().length == 0) {
                    return null;
                }
                file2.setWritable(true, true);
                throw new RuntimeException("Failed to wipe: ".concat(String.valueOf(String.valueOf(file2))));
            }
        }));
    }
}
