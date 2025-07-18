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
public final class umm implements umf {
    public static final umd a;
    public static final umd b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final ume e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final ume h;
    private final uiv i = new uiv();

    static {
        unx unxVar = new unx("key");
        unxVar.d(new umh(1, umk.DEFAULT));
        a = unxVar.c();
        unx unxVar2 = new unx("value");
        unxVar2.d(new umh(2, umk.DEFAULT));
        b = unxVar2.c();
        e = new umn(1);
    }

    public umm(OutputStream outputStream, Map map, Map map2, ume umeVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = umeVar;
    }

    private static int g(umd umdVar) {
        uml umlVar = (uml) umdVar.a(uml.class);
        if (umlVar != null) {
            return umlVar.a();
        }
        throw new umc("Field has no @Protobuf config");
    }

    private static uml h(umd umdVar) {
        uml umlVar = (uml) umdVar.a(uml.class);
        if (umlVar != null) {
            return umlVar;
        }
        throw new umc("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) throws IOException {
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

    private final void k(long j) throws IOException {
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

    private final void l(ume umeVar, umd umdVar, Object obj, boolean z) throws IOException {
        umi umiVar = new umi();
        try {
            OutputStream outputStream = this.f;
            this.f = umiVar;
            try {
                umeVar.a(obj, this);
                this.f = outputStream;
                long j = umiVar.a;
                umiVar.close();
                if (z && j == 0) {
                    return;
                }
                j((g(umdVar) << 3) | 2);
                k(j);
                umeVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                umiVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.umf
    public final /* bridge */ /* synthetic */ void a(umd umdVar, long j) throws IOException {
        d(umdVar, j, true);
    }

    @Override // defpackage.umf
    public final void b(umd umdVar, Object obj) throws IOException {
        f(umdVar, obj, true);
    }

    final void c(umd umdVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return;
        }
        uml umlVarH = h(umdVar);
        int iOrdinal = umlVarH.b().ordinal();
        if (iOrdinal == 0) {
            j(umlVarH.a() << 3);
            j(i);
        } else if (iOrdinal == 1) {
            j(umlVarH.a() << 3);
            j((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((umlVarH.a() << 3) | 5);
            this.f.write(i(4).putInt(i).array());
        }
    }

    final void d(umd umdVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        uml umlVarH = h(umdVar);
        int iOrdinal = umlVarH.b().ordinal();
        if (iOrdinal == 0) {
            j(umlVarH.a() << 3);
            k(j);
        } else if (iOrdinal == 1) {
            j(umlVarH.a() << 3);
            k((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            j((umlVarH.a() << 3) | 1);
            this.f.write(i(8).putLong(j).array());
        }
    }

    public final void e(umd umdVar, int i) {
        c(umdVar, i, true);
    }

    final void f(umd umdVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            j((g(umdVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(d);
            j(bytes.length);
            this.f.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(umdVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(e, umdVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            j((g(umdVar) << 3) | 1);
            this.f.write(i(8).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            j((g(umdVar) << 3) | 5);
            this.f.write(i(4).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            d(umdVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            c(umdVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            j((g(umdVar) << 3) | 2);
            j(bArr.length);
            this.f.write(bArr);
            return;
        }
        ume umeVar = (ume) this.c.get(obj.getClass());
        if (umeVar != null) {
            l(umeVar, umdVar, obj, z);
            return;
        }
        umg umgVar = (umg) this.g.get(obj.getClass());
        if (umgVar != null) {
            umgVar.a(obj, this.i);
            return;
        }
        if (obj instanceof umj) {
            e(umdVar, ((umj) obj).a());
        } else if (obj instanceof Enum) {
            e(umdVar, ((Enum) obj).ordinal());
        } else {
            l(this.h, umdVar, obj, z);
        }
    }
}
