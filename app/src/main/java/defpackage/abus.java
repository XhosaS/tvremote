package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abus implements abyq {
    private static void a(List list, int i) {
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

    public static void m(Iterable iterable, List list) {
        Charset charset = abxt.a;
        iterable.getClass();
        if (iterable instanceof abyc) {
            List listA = ((abyc) iterable).a();
            abyc abycVar = (abyc) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (abycVar.size() - size) + " is null.";
                    int size2 = abycVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        abycVar.remove(size2);
                    }
                } else if (obj instanceof abvo) {
                    abycVar.b();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    abvo.u(bArr, 0, bArr.length);
                    abycVar.b();
                } else {
                    abycVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof abyz) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof abzb) {
                ((abzb) list).e(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    a(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i = 0; i < size5; i++) {
            Object obj3 = list2.get(i);
            if (obj3 == null) {
                a(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract abus h();

    protected abstract abus i(abut abutVar);

    @Override // defpackage.abyq
    public final /* bridge */ /* synthetic */ abyq j(MessageLite messageLite) {
        if (x().getClass().isInstance(messageLite)) {
            return i((abut) messageLite);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // defpackage.abyq
    public final /* synthetic */ abyq k(byte[] bArr) {
        return p(bArr, bArr.length);
    }

    @Override // defpackage.abyq
    public final /* synthetic */ abyq l(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return q(bArr, bArr.length, extensionRegistryLite);
    }

    /* renamed from: n */
    public abstract void o(abvt abvtVar, ExtensionRegistryLite extensionRegistryLite);

    @Override // defpackage.abyq
    public /* bridge */ /* synthetic */ void o(abvt abvtVar, ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }

    public abus p(byte[] bArr, int i) {
        throw null;
    }

    public abus q(byte[] bArr, int i, ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }

    @Override // defpackage.abyq
    public final /* bridge */ /* synthetic */ void r(abvo abvoVar) throws abxv {
        try {
            abvt abvtVarK = abvoVar.k();
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            o(abvtVarK, ExtensionRegistryLite.a);
            abvtVarK.z(0);
        } catch (abxv e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(a.x(this, "Reading ", " from a ByteString threw an IOException (should never happen)."), e2);
        }
    }
}
