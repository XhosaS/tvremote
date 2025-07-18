package defpackage;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMessageValueUtils;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mip implements mik {
    public static final boolean a = UpbUnsafe.b;
    public final UpbMessage b;
    public final long c;

    protected mip(UpbMessage upbMessage) {
        this.b = upbMessage;
        this.c = upbMessage.a;
    }

    public static boolean av(long j, int i) {
        boolean z = UpbUnsafe.a;
        return Memory.peekByte(j + ((long) i)) != 0;
    }

    @Override // defpackage.mik
    public final mil a(mii miiVar) {
        UpbMessage upbMessage = this.b;
        long jA = miiVar.a();
        UpbMiniTable upbMiniTableD = miiVar.d();
        UpbArena upbArena = upbMessage.c;
        long jJniGetExtension = UpbMessage.jniGetExtension(upbMessage.a, jA, upbArena.a);
        return miiVar.c(jJniGetExtension == 0 ? null : new UpbMessage(jJniGetExtension, upbMiniTableD, upbArena));
    }

    protected final UpbMessage ap(int i, UpbMiniTable upbMiniTable) {
        return new UpbMessage(UpbUnsafe.b ? Memory.peekLong(this.c + i, false) : Memory.peekInt(r0, false), upbMiniTable, this.b.c);
    }

    public final String aq(int i) {
        long j = this.c + i;
        String strJniConvertToShortString = UpbMessageValueUtils.jniConvertToShortString(j);
        return strJniConvertToShortString == null ? UpbMessageValueUtils.jniConvertToLongString(j) : strJniConvertToShortString;
    }

    protected final ArrayList ar(int i) {
        float[] fArrJniRetrieveFloatArray = UpbMessageValueUtils.jniRetrieveFloatArray(UpbUnsafe.b ? Memory.peekLong(this.c + i, false) : Memory.peekInt(r0, false));
        if (fArrJniRetrieveFloatArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(fArrJniRetrieveFloatArray.length);
        for (float f : fArrJniRetrieveFloatArray) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    protected final ArrayList as(int i) {
        int[] iArrJniRetrieveIntArray = UpbMessageValueUtils.jniRetrieveIntArray(UpbUnsafe.b ? Memory.peekLong(this.c + i, false) : Memory.peekInt(r0, false));
        if (iArrJniRetrieveIntArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(iArrJniRetrieveIntArray.length);
        for (int i2 : iArrJniRetrieveIntArray) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    protected final ArrayList at(int i, UpbMiniTable upbMiniTable, miq miqVar) {
        long[] jArrJniRetrievePointerArray = UpbMessageValueUtils.jniRetrievePointerArray(UpbUnsafe.b ? Memory.peekLong(this.c + i, false) : Memory.peekInt(r0, false));
        if (jArrJniRetrievePointerArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jArrJniRetrievePointerArray.length);
        for (long j : jArrJniRetrievePointerArray) {
            arrayList.add(miqVar.a(new UpbMessage(j, upbMiniTable, this.b.c)));
        }
        return arrayList;
    }

    public final void au(byte[] bArr) {
        int length = bArr.length;
        UpbMessage upbMessage = this.b;
        UpbArena upbArena = upbMessage.c;
        upbMessage.jniDecode(upbMessage.a, upbMessage.b.a, upbArena.a, bArr, 0, length);
    }

    public final boolean aw(int i, int i2) {
        boolean z = UpbUnsafe.a;
        return (Memory.peekByte(this.c + ((long) i)) & i2) != 0;
    }

    protected final boolean ay(int i, int i2) {
        boolean z = UpbUnsafe.a;
        long j = this.c + i;
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(j + 1);
        boolean z2 = UpbUnsafe.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((bPeekByte & 255) | (b << 8))) == i2;
    }

    protected final byte[] az(int i) {
        return UpbMessageValueUtils.jniCopyToByteArray(this.c + i);
    }

    @Override // defpackage.mik
    public final boolean b(mii miiVar) {
        return UpbMessage.jniHasExtension(this.b.a, miiVar.a);
    }

    @Override // defpackage.mil
    public final int c() {
        UpbMessage upbMessage = this.b;
        return upbMessage.jniGetFirstExtensionOrUnknownFieldNumber(upbMessage.a);
    }

    @Override // defpackage.mil
    public final yyk d(int i) {
        yyf yyfVar = new yyf(4);
        UpbMessage upbMessage = this.b;
        for (byte[] bArr : upbMessage.jniGetExtensionOrUnknownField(upbMessage.a, i)) {
            yyfVar.g(ByteBuffer.wrap(bArr));
        }
        return yyfVar.f();
    }

    @Override // defpackage.mil
    public final byte[] e() {
        ax();
        UpbMessage upbMessage = this.b;
        return upbMessage.jniEncode(upbMessage.a, upbMessage.b.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mip) {
            return this.b.equals(((mip) obj).b);
        }
        return false;
    }

    @Override // defpackage.mil
    public final int[] f() {
        UpbMessage upbMessage = this.b;
        return upbMessage.jniGetExtensionOrUnknownFieldNumbers(upbMessage.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    protected void ax() {
    }
}
