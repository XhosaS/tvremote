package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abww extends abus {
    public final abxd a;
    public abxd b;

    protected abww(abxd abxdVar) {
        this.a = abxdVar;
        if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = (abxd) abxdVar.cM(4, null);
    }

    private static void a(Object obj, Object obj2) {
        abza.a.a(obj.getClass()).h(obj, obj2);
    }

    @Override // defpackage.abus, defpackage.abyq
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(abvt abvtVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        try {
            abza.a.a(this.b.getClass()).i(this.b, abvu.p(abvtVar), extensionRegistryLite);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    public final void B(abxd abxdVar) {
        abxd abxdVar2 = this.a;
        if (abxdVar2 == abxdVar) {
            return;
        }
        if (abxdVar != null && abxdVar2.getClass() == abxdVar.getClass() && abza.a.a(abxdVar2.getClass()).k(abxdVar2, abxdVar)) {
            return;
        }
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        a(this.b, abxdVar);
    }

    public final void C(byte[] bArr, int i, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        try {
            abza.a.a(this.b.getClass()).j(this.b, bArr, 0, i, new abuz(extensionRegistryLite));
        } catch (abxv e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.abus
    protected final /* synthetic */ abus i(abut abutVar) {
        B((abxd) abutVar);
        return this;
    }

    @Override // defpackage.abus
    public final /* bridge */ /* synthetic */ abus p(byte[] bArr, int i) throws abxv {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        abza abzaVar = abza.a;
        C(bArr, i, ExtensionRegistryLite.a);
        return this;
    }

    @Override // defpackage.abus
    public final /* bridge */ /* synthetic */ abus q(byte[] bArr, int i, ExtensionRegistryLite extensionRegistryLite) throws abxv {
        C(bArr, i, extensionRegistryLite);
        return this;
    }

    @Override // defpackage.abus
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final abww h() {
        abww abwwVar = (abww) this.a.cM(5, null);
        abwwVar.b = w();
        return abwwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r3 != false) goto L12;
     */
    @Override // defpackage.abyq
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.abxd v() {
        /*
            r5 = this;
            abxd r0 = r5.w()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.cM(r1, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L2d
        L13:
            if (r3 == 0) goto L2e
            abza r3 = defpackage.abza.a
            java.lang.Class r4 = r0.getClass()
            abzj r3 = r3.a(r4)
            boolean r3 = r3.l(r0)
            if (r1 == r3) goto L26
            goto L27
        L26:
            r2 = r0
        L27:
            r1 = 2
            r0.cM(r1, r2)
            if (r3 == 0) goto L2e
        L2d:
            return r0
        L2e:
            abzz r0 = new abzz
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abww.v():abxd");
    }

    @Override // defpackage.abyq
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public abxd w() {
        abxd abxdVar = this.b;
        if ((abxdVar.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            return abxdVar;
        }
        abza.a.a(abxdVar.getClass()).g(abxdVar);
        abxdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        return this.b;
    }

    @Override // defpackage.abyr
    public final /* synthetic */ MessageLite x() {
        return this.a;
    }

    public void y() {
        abxd abxdVar = (abxd) this.a.cM(4, null);
        a(abxdVar, this.b);
        this.b = abxdVar;
    }

    @Override // defpackage.abyr
    public final boolean z() {
        abxd abxdVar = this.b;
        Map map = abxd.defaultInstanceMap;
        byte bByteValue = ((Byte) abxdVar.cM(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        return abza.a.a(abxdVar.getClass()).l(abxdVar);
    }
}
