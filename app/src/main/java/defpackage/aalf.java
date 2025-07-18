package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalf {
    public static final aakw a;
    public static final aakw b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final aakx e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final aakx h;
    private final aalj i = new aalj();

    static {
        aakv aakvVar = new aakv("key");
        aakvVar.b(new aakz(1, aalc.DEFAULT));
        a = aakvVar.a();
        aakv aakvVar2 = new aakv("value");
        aakvVar2.b(new aakz(2, aalc.DEFAULT));
        b = aakvVar2.a();
        e = new aakx() { // from class: aale
            @Override // defpackage.aakt
            public final void a(Object obj, Object obj2) throws IOException {
                Map.Entry entry = (Map.Entry) obj;
                aalf aalfVar = (aalf) obj2;
                aalfVar.c(aalf.a, entry.getKey(), true);
                aalfVar.c(aalf.b, entry.getValue(), true);
            }
        };
    }

    public aalf(OutputStream outputStream, Map map, Map map2, aakx aakxVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = aakxVar;
    }

    private static int d(aakw aakwVar) {
        aald aaldVar = (aald) aakwVar.a(aald.class);
        if (aaldVar != null) {
            return aaldVar.a();
        }
        throw new aaku("Field has no @Protobuf config");
    }

    private static aald e(aakw aakwVar) {
        aald aaldVar = (aald) aakwVar.a(aald.class);
        if (aaldVar != null) {
            return aaldVar;
        }
        throw new aaku("Field has no @Protobuf config");
    }

    private static ByteBuffer f(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void g(int i) throws IOException {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) == 0) {
                this.f.write(i2);
                return;
            } else {
                this.f.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    private final void h(long j) throws IOException {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) == 0) {
                this.f.write(i);
                return;
            } else {
                this.f.write(i | 128);
                j >>>= 7;
            }
        }
    }

    private final void i(aakx aakxVar, aakw aakwVar, Object obj, boolean z) throws IOException {
        aala aalaVar = new aala();
        try {
            OutputStream outputStream = this.f;
            this.f = aalaVar;
            try {
                aakxVar.a(obj, this);
                this.f = outputStream;
                long j = aalaVar.a;
                aalaVar.close();
                if (z && j == 0) {
                    return;
                }
                g((d(aakwVar) << 3) | 2);
                h(j);
                aakxVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                aalaVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void a(aakw aakwVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return;
        }
        aald aaldVarE = e(aakwVar);
        int iOrdinal = aaldVarE.b().ordinal();
        if (iOrdinal == 0) {
            g(aaldVarE.a() << 3);
            g(i);
        } else if (iOrdinal == 1) {
            g(aaldVarE.a() << 3);
            g((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            g((aaldVarE.a() << 3) | 5);
            this.f.write(f(4).putInt(i).array());
        }
    }

    public final void b(aakw aakwVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        aald aaldVarE = e(aakwVar);
        int iOrdinal = aaldVarE.b().ordinal();
        if (iOrdinal == 0) {
            g(aaldVarE.a() << 3);
            h(j);
        } else if (iOrdinal == 1) {
            g(aaldVarE.a() << 3);
            h((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            g((aaldVarE.a() << 3) | 1);
            this.f.write(f(8).putLong(j).array());
        }
    }

    public final void c(aakw aakwVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            g((d(aakwVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            g(bytes.length);
            this.f.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(aakwVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(e, aakwVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            g((d(aakwVar) << 3) | 1);
            this.f.write(f(8).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            g((d(aakwVar) << 3) | 5);
            this.f.write(f(4).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            b(aakwVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            a(aakwVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            g((d(aakwVar) << 3) | 2);
            g(bArr.length);
            this.f.write(bArr);
            return;
        }
        aakx aakxVar = (aakx) this.c.get(obj.getClass());
        if (aakxVar != null) {
            i(aakxVar, aakwVar, obj, z);
            return;
        }
        aaky aakyVar = (aaky) this.g.get(obj.getClass());
        if (aakyVar != null) {
            aakyVar.a(obj, this.i);
            return;
        }
        if (obj instanceof aalb) {
            a(aakwVar, ((aalb) obj).a(), true);
        } else if (obj instanceof Enum) {
            a(aakwVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.h, aakwVar, obj, z);
        }
    }
}
