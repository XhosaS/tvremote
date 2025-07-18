package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mcr implements mcq {
    private final ldv a;
    private final ltp b;
    private final kwy c;

    public mcr(ldv ldvVar, ltp ltpVar, kwy kwyVar) {
        this.a = ldvVar;
        this.b = ltpVar;
        this.c = kwyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    @Override // defpackage.mcq
    public final boolean a() {
        int i;
        UnmodifiableIterator unmodifiableIterator;
        int i2;
        boolean z;
        kwy kwyVar = this.c;
        Cursor cursorQuery = ((lyz) kwyVar.a).b().query(true, "wishlist", new String[]{"wishlist_account"}, "wishlist_item_state != 1", null, null, null, null, null);
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            while (true) {
                i = 0;
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                builder.add((ImmutableList.Builder) ksn.b(cursorQuery.getString(0)));
            }
            ImmutableList immutableListBuild = builder.build();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            UnmodifiableIterator it = immutableListBuild.iterator();
            boolean z2 = true;
            boolean z3 = 1;
            while (it.hasNext()) {
                ksn ksnVar = (ksn) it.next();
                if (this.a.s(ksnVar)) {
                    lyz lyzVar = (lyz) kwyVar.a;
                    String str = ksnVar.a;
                    Cursor cursorQuery2 = lyzVar.b().query(true, "wishlist", new String[]{"wishlist_item_type", "wishlist_item_id"}, "wishlist_account = ? AND wishlist_item_state = 2", new String[]{str}, null, null, null, null);
                    try {
                        ImmutableList.Builder builder2 = ImmutableList.builder();
                        while (cursorQuery2.moveToNext()) {
                            builder2.add((ImmutableList.Builder) ksy.c(cursorQuery2.getInt(i), cursorQuery2.getString(z2 ? 1 : 0)));
                        }
                        ImmutableList immutableListBuild2 = builder2.build();
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        Cursor cursorQuery3 = lyzVar.b().query(true, "wishlist", new String[]{"wishlist_item_type", "wishlist_item_id"}, "wishlist_account = ? AND wishlist_item_state = 3", new String[]{str}, null, null, null, null);
                        try {
                            ImmutableList.Builder builder3 = ImmutableList.builder();
                            while (cursorQuery3.moveToNext()) {
                                builder3.add((ImmutableList.Builder) ksy.c(cursorQuery3.getInt(i), cursorQuery3.getString(z2 ? 1 : 0)));
                            }
                            ImmutableList immutableListBuild3 = builder3.build();
                            if (cursorQuery3 != null) {
                                cursorQuery3.close();
                            }
                            if (!immutableListBuild2.isEmpty() || !immutableListBuild3.isEmpty()) {
                                ieg iegVar = (ieg) this.b.b(new lum(ksnVar, immutableListBuild2, immutableListBuild3));
                                if (iegVar.k()) {
                                    z3 = i;
                                } else {
                                    lun lunVar = (lun) iegVar.g();
                                    ImmutableList immutableList = lunVar.a;
                                    if (immutableList.isEmpty()) {
                                        unmodifiableIterator = it;
                                        i2 = i;
                                    } else {
                                        SQLiteDatabase sQLiteDatabaseA = lyzVar.a();
                                        try {
                                            ContentValues contentValues = new ContentValues(z2 ? 1 : 0);
                                            contentValues.put("wishlist_item_state", Integer.valueOf(z2 ? 1 : 0));
                                            int i3 = i;
                                            ?? r3 = z2;
                                            while (i3 < immutableList.size()) {
                                                int iMin = Math.min(i3 + 50, immutableList.size());
                                                int i4 = iMin - i3;
                                                int i5 = i;
                                                String strCr = a.cr(mei.d("wishlist_item_id", i4), "wishlist_account = ? AND wishlist_item_state = 2 AND ");
                                                String[] strArr = new String[i4 + 1];
                                                strArr[i5] = str;
                                                UnmodifiableIterator unmodifiableIterator2 = it;
                                                int i6 = i5;
                                                while (i6 < i4) {
                                                    int i7 = i6 + 1;
                                                    strArr[i7] = ((ksy) immutableList.get(i6 + i3)).b;
                                                    i6 = i7;
                                                }
                                                sQLiteDatabaseA.update("wishlist", contentValues, strCr, strArr);
                                                i3 = iMin;
                                                i = i5;
                                                it = unmodifiableIterator2;
                                                r3 = 1;
                                            }
                                            unmodifiableIterator = it;
                                            i2 = i;
                                            lyzVar.f(sQLiteDatabaseA, r3, r3);
                                        } catch (Throwable th) {
                                            ((lyz) kwyVar.a).f(sQLiteDatabaseA, true, 1);
                                            throw th;
                                        }
                                    }
                                    ImmutableList immutableList2 = lunVar.b;
                                    if (immutableList2.isEmpty()) {
                                        z = true;
                                    } else {
                                        SQLiteDatabase sQLiteDatabaseA2 = lyzVar.a();
                                        int i8 = i2;
                                        while (i8 < immutableList2.size()) {
                                            try {
                                                int iMin2 = Math.min(i8 + 50, immutableList2.size());
                                                int i9 = iMin2 - i8;
                                                String strCr2 = a.cr(mei.d("wishlist_item_id", i9), "wishlist_account = ? AND wishlist_item_state = 3 AND ");
                                                String[] strArr2 = new String[i9 + 1];
                                                strArr2[i2] = str;
                                                int i10 = i2;
                                                while (i10 < i9) {
                                                    int i11 = i10 + 1;
                                                    strArr2[i11] = ((ksy) immutableList2.get(i10 + i8)).b;
                                                    i10 = i11;
                                                }
                                                sQLiteDatabaseA2.delete("wishlist", strCr2, strArr2);
                                                i8 = iMin2;
                                            } catch (Throwable th2) {
                                                ((lyz) kwyVar.a).f(sQLiteDatabaseA2, true, 1);
                                                throw th2;
                                            }
                                        }
                                        z = true;
                                        lyzVar.f(sQLiteDatabaseA2, true, 1);
                                    }
                                    krd.e("Watchlist uploaded");
                                    z2 = z;
                                    i = i2;
                                    it = unmodifiableIterator;
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                unmodifiableIterator = it;
                i2 = i;
                z = z2 ? 1 : 0;
                z2 = z;
                i = i2;
                it = unmodifiableIterator;
            }
            return z3;
        } finally {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th3) {
                th.addSuppressed(th3);
            }
        }
    }
}
