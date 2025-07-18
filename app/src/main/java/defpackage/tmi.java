package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tmi {
    public static final tmh a = new tmh();
    private final agow b;

    public tmi(agow agowVar) {
        this.b = agowVar;
    }

    public abstract tmi a(addl addlVar);

    public abstract tmi b(acji acjiVar);

    public abstract tmi c(acjn acjnVar);

    public abstract tmi d(tmd tmdVar);

    protected abstract acji e();

    public final void f(final String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        final jzu jzuVar = (jzu) this.b.a();
        jzuVar.d.writeLock().lock();
        try {
            Object obj = (jzj) jzuVar.j.get(str);
            if (obj == null) {
                obj = (jzn) jzuVar.b(str, new yrp() { // from class: jzf
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return new jzn(jzuVar, str);
                    }
                });
                reentrantReadWriteLock = jzuVar.d;
            } else {
                reentrantReadWriteLock = jzuVar.d;
            }
            reentrantReadWriteLock.writeLock().unlock();
            ((jzn) obj).a(0L, jzo.a(e()));
        } catch (Throwable th) {
            jzuVar.d.writeLock().unlock();
            throw th;
        }
    }

    public final void g(final String str, int i) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        final jzu jzuVar = (jzu) this.b.a();
        jzuVar.d.writeLock().lock();
        try {
            Object obj = (jzj) jzuVar.j.get(str);
            if (obj == null) {
                obj = (jzq) jzuVar.b(str, new yrp() { // from class: jzh
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return new jzq(jzuVar, str);
                    }
                });
                reentrantReadWriteLock = jzuVar.d;
            } else {
                reentrantReadWriteLock = jzuVar.d;
            }
            reentrantReadWriteLock.writeLock().unlock();
            ((jzq) obj).a(i, jzo.a(e()));
        } catch (Throwable th) {
            jzuVar.d.writeLock().unlock();
            throw th;
        }
    }

    public final void h(final String str, long j) {
        jzk jzkVar;
        str.getClass();
        final jzu jzuVar = (jzu) this.b.a();
        ReentrantReadWriteLock reentrantReadWriteLock = jzuVar.d;
        final jzm jzmVar = jzu.n;
        reentrantReadWriteLock.writeLock().lock();
        try {
            jzj jzjVar = (jzj) jzuVar.j.get(str);
            if (jzjVar == null) {
                jzkVar = (jzs) jzuVar.b(str, new yrp() { // from class: jzg
                    @Override // defpackage.yrp
                    public final Object eV() {
                        return new jzs(jzuVar, str, jzmVar);
                    }
                });
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                try {
                    jzk jzkVar2 = (jzk) jzjVar;
                    if (!jzmVar.equals(jzkVar2.f)) {
                        throw new IllegalArgumentException(a.j(str, "alias mismatch: "));
                    }
                    jzuVar.d.writeLock().unlock();
                    jzkVar = jzkVar2;
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(a.j(str, "another type of counter exists with name: "), e);
                }
            }
            jzs jzsVar = (jzs) jzkVar;
            jzo jzoVarA = jzo.a(e());
            jzm jzmVar2 = jzsVar.f;
            jzsVar.a(j, jzoVarA);
        } catch (Throwable th) {
            jzuVar.d.writeLock().unlock();
            throw th;
        }
    }
}
