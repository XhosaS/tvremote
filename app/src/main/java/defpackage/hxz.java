package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxz implements hxv {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/searchbar/features/GeminiPoweredImpl");
    public final ContentResolver b;
    public final ahbt c;
    private final agow d;
    private boolean e;
    private boolean f;
    private String g;

    public hxz(agow agowVar, ContentResolver contentResolver, ahbt ahbtVar) {
        ahbtVar.getClass();
        this.d = agowVar;
        this.b = contentResolver;
        this.c = ahbtVar;
        this.g = "";
        if (((Boolean) agowVar.a()).booleanValue()) {
            ahal.e(ahbtVar, null, 0, new hxw(this, null), 3);
        }
    }

    @Override // defpackage.hxv
    public final String a() {
        return this.g;
    }

    @Override // defpackage.hxv
    public final boolean b() {
        return ((Boolean) this.d.a()).booleanValue() && this.e;
    }

    @Override // defpackage.hxv
    public final boolean c() {
        return this.f;
    }

    public final Object d() throws abxv {
        int i;
        aedj aedjVar;
        byte bByteValue;
        try {
            Cursor cursorQuery = this.b.query(urr.b, null, null, null, null);
            if (cursorQuery != null) {
                aedf aedfVar = null;
                if (cursorQuery.moveToFirst()) {
                    i = cursorQuery.getInt(0);
                    cursorQuery.getString(1);
                    byte[] blob = cursorQuery.getBlob(2);
                    abxd abxdVarH = abxd.h(aedj.a, blob, 0, blob.length, ExtensionRegistryLite.getGeneratedRegistry());
                    if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            abxdVarH.cM(2, true != zL ? null : abxdVarH);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                    aedjVar = (aedj) abxdVarH;
                } else {
                    i = -1;
                    aedjVar = null;
                }
                if (i < 0) {
                    throw new IllegalStateException();
                }
                Iterator it = aedjVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aedh aedhVar = (aedh) it.next();
                    if (aedhVar.b == 8) {
                        aedfVar = aedhVar.c;
                        if (aedfVar == null) {
                            aedfVar = aedf.a;
                        }
                    }
                }
                if (aedfVar != null) {
                    int i2 = aedfVar.d;
                    char c = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
                    this.e = c != 0 && c == 3;
                    int i3 = (aedfVar.b == 8 ? (aedl) aedfVar.c : aedl.a).b;
                    char c2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
                    if (c2 != 0 && c2 == 5) {
                        this.f = true;
                        aedv aedvVar = (aedfVar.b == 8 ? (aedl) aedfVar.c : aedl.a).c;
                        if (aedvVar == null) {
                            aedvVar = aedv.a;
                        }
                        String str = aedvVar.b;
                        str.getClass();
                        this.g = str;
                    } else {
                        this.f = false;
                        this.g = "";
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/searchbar/features/GeminiPoweredImpl", "updateFeatureEligibilityStatuses", 112, "GeminiPoweredImpl.kt")).u("Features API is empty.");
            } else {
                ((zdv) ((zdv) a.d()).p(e).q("com/google/android/apps/tvsearch/searchbar/features/GeminiPoweredImpl", "updateFeatureEligibilityStatuses", 113, "GeminiPoweredImpl.kt")).u("Failed to query features API.");
            }
        }
        return agpu.a;
    }
}
