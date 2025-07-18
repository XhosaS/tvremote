package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brk {
    public final void a(brs brsVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    brsVar.d(i);
                } else if (obj instanceof byte[]) {
                    brsVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    brsVar.b(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    brsVar.b(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    brsVar.c(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    brsVar.c(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    brsVar.c(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    brsVar.c(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    brsVar.e(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    brsVar.c(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }
}
