package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
interface dai {
    void changeCursor(Cursor cursor);

    CharSequence convertToString(Cursor cursor);

    Cursor getCursor();

    Cursor runQueryOnBackgroundThread(CharSequence charSequence);
}
