package defpackage;

import android.content.ContentValues;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psw extends psg {
    public static final ImmutableMap R;
    public int S;
    public long T;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put("watch_next_type", "watch_next_type");
        builder.put("last_engagement_time_utc_millis", "last_engagement_time_utc_millis");
        R = builder.putAll(a).buildOrThrow();
    }

    public static void b(psw pswVar, ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("watch_next_type");
        if (asInteger != null) {
            pswVar.S = asInteger.intValue();
        }
        Long asLong = contentValues.getAsLong("last_engagement_time_utc_millis");
        if (asLong != null) {
            pswVar.T = asLong.longValue();
        }
        pswVar.a(contentValues);
    }
}
