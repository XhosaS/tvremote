package defpackage;

import defpackage.vsf;
import defpackage.vsg;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vsf<MessageType extends vsg<MessageType, BuilderType>, BuilderType extends vsf<MessageType, BuilderType>> implements vvi {
    public static void h(Iterable iterable, List list) {
        Charset charset = vuo.a;
        iterable.getClass();
        if (iterable instanceof vux) {
            List listA = ((vux) iterable).a();
            vux vuxVar = (vux) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (vuxVar.size() - size) + " is null.";
                    int size2 = vuxVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        vuxVar.remove(size2);
                    }
                } else if (obj instanceof vsz) {
                    vuxVar.b();
                } else if (obj instanceof byte[]) {
                    vsz.q((byte[]) obj);
                    vuxVar.b();
                } else {
                    vuxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof vvr) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof vvt) {
                vvt vvtVar = (vvt) list;
                int size4 = list.size() + size3;
                int length = vvtVar.b.length;
                if (size4 > length) {
                    if (length == 0) {
                        vvtVar.b = new Object[Math.max(size4, 10)];
                    } else {
                        while (length < size4) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        vvtVar.b = Arrays.copyOf(vvtVar.b, length);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    n(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                n(list, size5);
            }
            list.add(obj3);
        }
    }

    private static void n(List list, int i) {
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
    public abstract vsf clone();

    protected abstract vsf b(vsg vsgVar);

    @Override // defpackage.vvi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vsf f(byte[] bArr) {
        return k(bArr, bArr.length);
    }

    @Override // defpackage.vvi
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final vsf g(byte[] bArr, vtp vtpVar) {
        return l(bArr, bArr.length, vtpVar);
    }

    @Override // defpackage.vvi
    public final /* bridge */ /* synthetic */ vvi e(vvj vvjVar) {
        if (t().getClass().isInstance(vvjVar)) {
            return b((vsg) vvjVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: i */
    public abstract void j(vte vteVar, vtp vtpVar);

    @Override // defpackage.vvi
    public /* bridge */ /* synthetic */ void j(vte vteVar, vtp vtpVar) {
        throw null;
    }

    public vsf k(byte[] bArr, int i) {
        throw null;
    }

    public vsf l(byte[] bArr, int i, vtp vtpVar) {
        throw null;
    }

    @Override // defpackage.vvi
    public final /* bridge */ /* synthetic */ void m(vsz vszVar) throws vuq {
        try {
            vte vteVarK = vszVar.k();
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            j(vteVarK, vtp.a);
            vteVarK.z(0);
        } catch (vuq e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }
}
