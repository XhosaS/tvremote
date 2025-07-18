package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abxd extends abut {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    protected acab unknownFields = acab.a;

    public static abxd h(abxd abxdVar, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        if (i2 == 0) {
            return abxdVar;
        }
        abxd abxdVar2 = (abxd) abxdVar.cM(4, null);
        try {
            abzj abzjVarA = abza.a.a(abxdVar2.getClass());
            abzjVarA.j(abxdVar2, bArr, i, i + i2, new abuz(extensionRegistryLite));
            abzjVarA.g(abxdVar2);
            return abxdVar2;
        } catch (abxv e) {
            if (e.a) {
                throw new abxv(e);
            }
            throw e;
        } catch (abzz e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof abxv) {
                throw ((abxv) e3.getCause());
            }
            throw new abxv(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.abut
    public final int cJ(abzj abzjVar) {
        int i = this.memoizedSerializedSize;
        if ((i & MUTABLE_FLAG_MASK) != 0) {
            int iA = abzjVar.a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
        }
        int i2 = i & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iA2 = abzjVar.a(this);
        if (iA2 < 0) {
            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) | iA2;
        return iA2;
    }

    public abstract Object cM(int i, Object obj);

    @Override // com.google.protobuf.MessageLite
    public final /* synthetic */ abyq cN() {
        abww abwwVar = (abww) cM(5, null);
        abwwVar.B(this);
        return abwwVar;
    }

    @Override // com.google.protobuf.MessageLite
    public final /* synthetic */ abyq cy() {
        return (abww) cM(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return abza.a.a(getClass()).k(this, (abxd) obj);
    }

    @Override // com.google.protobuf.MessageLite
    public final void f(abvz abvzVar) {
        abza.a.a(getClass()).m(this, abwa.a(abvzVar));
    }

    @Override // com.google.protobuf.MessageLite
    public final int g() {
        int i = this.memoizedSerializedSize;
        if ((i & MUTABLE_FLAG_MASK) != 0) {
            int iA = abza.a.a(getClass()).a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
        }
        int i2 = i & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iA2 = abza.a.a(getClass()).a(this);
        if (iA2 < 0) {
            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (MUTABLE_FLAG_MASK & this.memoizedSerializedSize) | iA2;
        return iA2;
    }

    public final int hashCode() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return abza.a.a(getClass()).b(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iB = abza.a.a(getClass()).b(this);
        this.memoizedHashCode = iB;
        return iB;
    }

    @Override // com.google.protobuf.MessageLite
    public final abyy i() {
        return (abyy) cM(7, null);
    }

    public final String toString() {
        String string = super.toString();
        int i = abys.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        abys.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.abyr
    public final /* synthetic */ MessageLite x() {
        return (abxd) cM(6, null);
    }

    @Override // defpackage.abyr
    public final boolean z() {
        byte bByteValue = ((Byte) cM(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zL = abza.a.a(getClass()).l(this);
        cM(2, true == zL ? this : null);
        return zL;
    }
}
