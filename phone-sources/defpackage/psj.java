package defpackage;

import android.content.ContentValues;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psj extends psg {
    public static final ImmutableMap R;
    public long S;
    public int T;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put("channel_id", "channel_id");
        builder.put("weight", "weight");
        R = builder.putAll(a).buildOrThrow();
    }

    public static void b(psj psjVar, ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("channel_id");
        if (asLong != null) {
            psjVar.S = asLong.longValue();
        }
        Integer asInteger = contentValues.getAsInteger("weight");
        if (asInteger != null) {
            psjVar.T = asInteger.intValue();
        }
        psjVar.a(contentValues);
    }
}
