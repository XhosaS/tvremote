package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ckd implements cmy {
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Iterable iterable, List list) {
        cmf.d(iterable);
        if (iterable instanceof cmn) {
            List listA = ((cmn) iterable).a();
            cmn cmnVar = (cmn) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (cmnVar.size() - size) + " is null.";
                    int size2 = cmnVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        cmnVar.remove(size2);
                    }
                } else if (obj instanceof ckv) {
                    cmnVar.b();
                } else if (obj instanceof byte[]) {
                    ckv.p((byte[]) obj);
                    cmnVar.b();
                } else {
                    cmnVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof cnh) {
            list.addAll(iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = iterable.size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof cnj) {
                cnj cnjVar = (cnj) list;
                int size4 = list.size() + size3;
                int length = cnjVar.b.length;
                if (size4 > length) {
                    if (length == 0) {
                        cnjVar.b = new Object[Math.max(size4, 10)];
                    } else {
                        while (length < size4) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        cnjVar.b = Arrays.copyOf(cnjVar.b, length);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    f(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        int size6 = iterable.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = iterable.get(i);
            if (obj3 == null) {
                f(list, size5);
            }
            list.add(obj3);
        }
    }

    private static void f(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    @Override // 
    /* renamed from: a */
    public abstract ckd clone();

    protected abstract ckd b(cke ckeVar);

    @Override // defpackage.cmy
    public final /* bridge */ /* synthetic */ cmy c(cmz cmzVar) {
        if (k().getClass().isInstance(cmzVar)) {
            return b((cke) cmzVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.cmy
    public /* bridge */ /* synthetic */ void e(cky ckyVar, cli cliVar) {
        throw null;
    }
}
