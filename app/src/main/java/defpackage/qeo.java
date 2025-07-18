package defpackage;

import android.util.Log;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qeo {
    public static ByteBuffer a(Iterable iterable) {
        long jG = 0;
        int i = 0;
        int i2 = 0;
        while (iterable.iterator().hasNext()) {
            jG += ((MessageLite) r1.next()).g() + 12;
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) jG);
            byte[] bArrArray = byteBufferAllocate.array();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                MessageLite messageLite = (MessageLite) it.next();
                int iG = messageLite.g();
                try {
                    byteBufferAllocate.putInt(iG);
                    int i3 = i + 4;
                    try {
                        boolean z = abvz.e;
                        messageLite.f(new abvw(bArrArray, i3, iG));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        byteBufferAllocate.put(bArrArray, i3, iG);
                        int i4 = i3 + iG;
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArrArray, i4 - iG, iG);
                        byteBufferAllocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        c(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    c(e3);
                    return null;
                }
            }
            byteBufferAllocate.rewind();
            return byteBufferAllocate;
        } catch (IllegalArgumentException e4) {
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", jG > 1073741824 ? String.format(Locale.US, "%.2fGB", Double.valueOf(jG / 1.073741824E9d)) : jG > 1048576 ? String.format(Locale.US, "%.2fMB", Double.valueOf(jG / 1048576.0d)) : jG > 1024 ? String.format(Locale.US, "%.2fKB", Double.valueOf(jG / 1024.0d)) : String.format(Locale.US, "%d Bytes", Long.valueOf(jG))), e4);
            return null;
        }
    }

    public static List b(ByteBuffer byteBuffer, Class cls, abyy abyyVar) {
        abxd abxdVarH;
        String string = cls.toString();
        int iLimit = byteBuffer.limit();
        ArrayList arrayList = new ArrayList((byteBuffer.limit() / 1000) + 1);
        while (byteBuffer.position() < iLimit) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d. May have given the wrong message type: %s", Integer.valueOf(i), string));
                    return null;
                }
                if (iLimit < byteBuffer.position() + i + 8) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d (buffer end is %d)", Integer.valueOf(i), Integer.valueOf(iLimit)));
                    return arrayList;
                }
                long j = byteBuffer.getLong(byteBuffer.position() + i);
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                CRC32 crc32 = new CRC32();
                crc32.update(bArrArray, iArrayOffset, i);
                long value = crc32.getValue();
                if (value != j) {
                    Log.e("ProtoLiteUtil", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", Long.valueOf(j), Long.valueOf(value)));
                    return arrayList;
                }
                byte[] bArrArray2 = byteBuffer.array();
                int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.position();
                try {
                    ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                    abza abzaVar = abza.a;
                    abxdVarH = abxd.h(((abwx) abyyVar).b, bArrArray2, iArrayOffset2, i, ExtensionRegistryLite.a);
                    ((abuv) abyyVar).f(abxdVarH);
                } catch (abxv e) {
                    Log.e("ProtoLiteUtil", "Cannot deserialize message of type ".concat(cls.toString()), e);
                    abxdVarH = null;
                }
                if (abxdVarH == null) {
                    return null;
                }
                arrayList.add(abxdVarH);
                byteBuffer.position(byteBuffer.position() + i + 8);
            } catch (BufferUnderflowException e2) {
                Log.e("ProtoLiteUtil", String.format("Buffer underflow. May have given the wrong message type: %s", string), e2);
                return null;
            }
        }
        return arrayList;
    }

    private static void c(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }
}
