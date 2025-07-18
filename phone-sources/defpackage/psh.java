package defpackage;

import android.content.ContentValues;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psh {
    public static final ImmutableMap a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public byte[] j;
    public long k;
    public long l;
    public long m;
    public long n;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put("_id", "_id");
        builder.put("package_name", "package_name");
        builder.put("display_name", "display_name");
        builder.put("description", "description");
        builder.put("app_link_icon_uri", "app_link_icon_uri");
        builder.put("app_link_text", "app_link_text");
        builder.put("app_link_intent_uri", "app_link_intent_uri");
        builder.put("internal_provider_id", "internal_provider_id");
        builder.put("internal_provider_data", "internal_provider_data");
        builder.put("internal_provider_flag1", "internal_provider_flag1");
        builder.put("internal_provider_flag2", "internal_provider_flag2");
        builder.put("internal_provider_flag3", "internal_provider_flag3");
        builder.put("internal_provider_flag4", "internal_provider_flag4");
        a = builder.buildOrThrow();
    }

    public static void a(psh pshVar, ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("_id");
        if (asLong != null) {
            pshVar.b = asLong.longValue();
        }
        String asString = contentValues.getAsString("package_name");
        if (asString != null) {
            pshVar.c = asString;
        }
        String asString2 = contentValues.getAsString("display_name");
        if (asString2 != null) {
            pshVar.d = asString2;
        }
        String asString3 = contentValues.getAsString("description");
        if (asString3 != null) {
            pshVar.e = asString3;
        }
        String asString4 = contentValues.getAsString("app_link_icon_uri");
        if (asString4 != null) {
            pshVar.f = asString4;
        }
        String asString5 = contentValues.getAsString("app_link_text");
        if (asString5 != null) {
            pshVar.g = asString5;
        }
        String asString6 = contentValues.getAsString("app_link_intent_uri");
        if (asString6 != null) {
            pshVar.h = asString6;
        }
        String asString7 = contentValues.getAsString("internal_provider_id");
        if (asString7 != null) {
            pshVar.i = asString7;
        }
        byte[] asByteArray = contentValues.getAsByteArray("internal_provider_data");
        if (asByteArray != null) {
            pshVar.j = asByteArray;
        }
        Long asLong2 = contentValues.getAsLong("internal_provider_flag1");
        if (asLong2 != null) {
            pshVar.k = asLong2.longValue();
        }
        Long asLong3 = contentValues.getAsLong("internal_provider_flag2");
        if (asLong3 != null) {
            pshVar.l = asLong3.longValue();
        }
        Long asLong4 = contentValues.getAsLong("internal_provider_flag3");
        if (asLong4 != null) {
            pshVar.m = asLong4.longValue();
        }
        Long asLong5 = contentValues.getAsLong("internal_provider_flag4");
        if (asLong5 != null) {
            pshVar.n = asLong5.longValue();
        }
    }
}
