package defpackage;

import android.os.SystemClock;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jzu {
    public final String c;
    public final ReentrantReadWriteLock d;
    public final jyw e;
    public volatile int f;
    public ScheduledExecutorService g;
    public volatile Future h;
    public long i;
    public final Map j;
    public jzo k;
    public final LinkedHashSet l;
    public volatile jzr m;
    private final klk o;
    public static final jzm n = new jzm();
    static final jzo a = new jzo();
    public static final jzo b = new jzo();

    public jzu(jyw jywVar, klk klkVar) {
        this.d = new ReentrantReadWriteLock();
        this.j = new TreeMap();
        this.k = a;
        this.l = new LinkedHashSet();
        this.m = null;
        this.e = jywVar;
        this.c = "XUIKIT_COUNTERS";
        this.o = klkVar;
        this.i = SystemClock.elapsedRealtime();
    }

    public static long a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final jzj b(String str, yrp yrpVar) {
        this.d.writeLock().lock();
        try {
            jzj jzjVar = (jzj) yrpVar.eV();
            this.j.put(str, jzjVar);
            return jzjVar;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void c() {
        this.d.writeLock().lock();
        try {
            Future future = this.h;
            if (future != null) {
                future.cancel(false);
            }
            this.h = this.g.schedule(new Runnable() { // from class: jze
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() throws NoSuchAlgorithmException {
                    int i;
                    int iA;
                    jzu jzuVar = this.a;
                    jzuVar.d.writeLock().lock();
                    lvf lvfVarD = null;
                    try {
                        jzuVar.h = null;
                        ReentrantReadWriteLock reentrantReadWriteLock = jzuVar.d;
                        reentrantReadWriteLock.writeLock().unlock();
                        jzr jzrVar = jzuVar.m;
                        reentrantReadWriteLock.writeLock().lock();
                        try {
                            jzu jzuVar2 = new jzu(jzuVar);
                            jzuVar.d.writeLock().unlock();
                            LinkedHashSet linkedHashSet = jzuVar2.l;
                            int size = linkedHashSet.size();
                            jyv[] jyvVarArr = new jyv[size];
                            Iterator it = linkedHashSet.iterator();
                            int i2 = 0;
                            int i3 = 0;
                            while (it.hasNext()) {
                                jzo jzoVar = (jzo) it.next();
                                jyw jywVar = jzuVar2.e;
                                kkk.k(jzoVar);
                                Map map = jzuVar2.j;
                                ArrayList arrayList = new ArrayList(map.size());
                                for (jzj jzjVar : map.values()) {
                                    if (jzjVar.c.containsKey(jzoVar)) {
                                        arrayList.add(jzjVar);
                                    }
                                }
                                aeco aecoVar = aeco.a;
                                aecn aecnVar = new aecn();
                                long j = jzuVar2.i;
                                if ((aecnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    aecnVar.y();
                                }
                                aeco aecoVar2 = (aeco) aecnVar.b;
                                lvf lvfVar = lvfVarD;
                                aecoVar2.b |= 1;
                                aecoVar2.c = j;
                                kkk.f(!jzu.b.equals(jzoVar));
                                if (jzu.a.equals(jzoVar)) {
                                    i = i2;
                                } else {
                                    MessageLite messageLite = jzoVar.a;
                                    kkk.k(messageLite);
                                    try {
                                        int i4 = ((abxd) messageLite).memoizedSerializedSize;
                                        if ((i4 & Integer.MIN_VALUE) != 0) {
                                            iA = abza.a.a(messageLite.getClass()).a(messageLite);
                                            if (iA < 0) {
                                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                            }
                                        } else {
                                            iA = i4 & Integer.MAX_VALUE;
                                            if (iA == Integer.MAX_VALUE) {
                                                iA = abza.a.a(messageLite.getClass()).a(messageLite);
                                                if (iA < 0) {
                                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                }
                                                ((abxd) messageLite).memoizedSerializedSize = (((abxd) messageLite).memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                            }
                                        }
                                        abvo abvoVar = abvo.b;
                                        byte[] bArr = new byte[iA];
                                        boolean z = abvz.e;
                                        abvw abvwVar = new abvw(bArr, i2, iA);
                                        i = i2;
                                        abza.a.a(messageLite.getClass()).m(messageLite, abwa.a(abvwVar));
                                        abvo abvoVarA = abvk.a(abvwVar, bArr);
                                        if ((aecnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            aecnVar.y();
                                        }
                                        aeco aecoVar3 = (aeco) aecnVar.b;
                                        aecoVar3.b |= 4;
                                        aecoVar3.e = abvoVarA;
                                    } catch (IOException e) {
                                        throw new RuntimeException(a.x(messageLite, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
                                    }
                                }
                                int size2 = arrayList.size();
                                int i5 = i;
                                while (i5 < size2) {
                                    jzj jzjVar2 = (jzj) arrayList.get(i5);
                                    wr wrVar = (wr) jzjVar2.c.get(jzoVar);
                                    kkk.k(wrVar);
                                    aecm aecmVar = aecm.a;
                                    aecl aeclVar = new aecl();
                                    long jA = jzu.a(jzjVar2.a);
                                    if ((aeclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        aeclVar.y();
                                    }
                                    aecm aecmVar2 = (aecm) aeclVar.b;
                                    int i6 = size2;
                                    aecmVar2.b = 1;
                                    aecmVar2.c = Long.valueOf(jA);
                                    ArrayList arrayList2 = new ArrayList(wrVar.c());
                                    int i7 = i;
                                    while (i7 < wrVar.c()) {
                                        aeck aeckVar = aeck.a;
                                        aecj aecjVar = new aecj();
                                        jyv[] jyvVarArr2 = jyvVarArr;
                                        int i8 = i5;
                                        long j2 = ((long[]) wrVar.g(i7))[i];
                                        Iterator it2 = it;
                                        if ((aecjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            aecjVar.y();
                                        }
                                        aeck aeckVar2 = (aeck) aecjVar.b;
                                        int i9 = i3;
                                        aeckVar2.b |= 2;
                                        aeckVar2.d = j2;
                                        long jD = wrVar.d(i7);
                                        if (jzjVar2 instanceof jzn) {
                                            kkk.f(jD == 0 ? 1 : i);
                                        } else {
                                            if ((aecjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                aecjVar.y();
                                            }
                                            aeck aeckVar3 = (aeck) aecjVar.b;
                                            aeckVar3.b |= 1;
                                            aeckVar3.c = jD;
                                        }
                                        arrayList2.add((aeck) aecjVar.v());
                                        i7++;
                                        it = it2;
                                        jyvVarArr = jyvVarArr2;
                                        i5 = i8;
                                        i3 = i9;
                                    }
                                    Iterator it3 = it;
                                    jyv[] jyvVarArr3 = jyvVarArr;
                                    int i10 = i5;
                                    int i11 = i3;
                                    Collections.sort(arrayList2, new Comparator() { // from class: jzp
                                        @Override // java.util.Comparator
                                        public final int compare(Object obj, Object obj2) {
                                            return Long.compare(((aeck) obj).c, ((aeck) obj2).c);
                                        }
                                    });
                                    if ((aeclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        aeclVar.y();
                                    }
                                    aecm aecmVar3 = (aecm) aeclVar.b;
                                    abxs abxsVar = aecmVar3.d;
                                    if (!abxsVar.c()) {
                                        int size3 = abxsVar.size();
                                        aecmVar3.d = abxsVar.d(size3 + size3);
                                    }
                                    abus.m(arrayList2, aecmVar3.d);
                                    aecm aecmVar4 = (aecm) aeclVar.v();
                                    if ((aecnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        aecnVar.y();
                                    }
                                    aeco aecoVar4 = (aeco) aecnVar.b;
                                    aecmVar4.getClass();
                                    abxs abxsVar2 = aecoVar4.d;
                                    if (!abxsVar2.c()) {
                                        int size4 = abxsVar2.size();
                                        aecoVar4.d = abxsVar2.d(size4 + size4);
                                    }
                                    aecoVar4.d.add(aecmVar4);
                                    i5 = i10 + 1;
                                    it = it3;
                                    jyvVarArr = jyvVarArr3;
                                    size2 = i6;
                                    i3 = i11;
                                }
                                int i12 = i3;
                                i3 = i12 + 1;
                                jyvVarArr[i12] = jywVar.h((aeco) aecnVar.v());
                                lvfVarD = lvfVar;
                                i2 = i;
                            }
                            lvf lvfVar2 = lvfVarD;
                            jyv[] jyvVarArr4 = jyvVarArr;
                            while (i2 < size) {
                                jyv jyvVar = jyvVarArr4[i2];
                                jyvVar.k = jzuVar2.c;
                                lvfVarD = jyvVar.d();
                                i2++;
                            }
                            if (lvfVarD != null) {
                                return;
                            }
                            lvq.c(lvfVar2);
                        } finally {
                        }
                    } finally {
                    }
                }
            }, this.f, TimeUnit.MILLISECONDS);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.d.readLock().lock();
        try {
            sb.append("{");
            new yqn(", ").e(sb, this.l);
            sb.append("}\n");
            new yqn("\n").e(sb, this.j.values());
            this.d.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public jzu(jzu jzuVar) {
        Object jzlVar;
        this(jzuVar.e, jzuVar.o);
        ReentrantReadWriteLock.WriteLock writeLock = jzuVar.d.writeLock();
        writeLock.lock();
        try {
            this.k = jzuVar.k;
            this.i = jzuVar.i;
            for (Map.Entry entry : jzuVar.j.entrySet()) {
                Map map = this.j;
                String str = (String) entry.getKey();
                jzj jzjVar = (jzj) entry.getValue();
                if (jzjVar instanceof jzn) {
                    jzlVar = new jzn(this, (jzn) jzjVar);
                } else if (jzjVar instanceof jzt) {
                    jzlVar = new jzt(this, (jzt) jzjVar);
                } else if (jzjVar instanceof jzq) {
                    jzlVar = new jzq(this, (jzq) jzjVar);
                } else if (jzjVar instanceof jzs) {
                    jzlVar = new jzs(this, (jzs) jzjVar);
                } else if (jzjVar instanceof jzl) {
                    jzlVar = new jzl(this, (jzl) jzjVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(jzjVar))));
                }
                map.put(str, jzlVar);
            }
            this.l.addAll(jzuVar.l);
            jzuVar.l.clear();
            jzuVar.i = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}
