package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class daj extends Filter {
    final dai a;

    public daj(dai daiVar) {
        this.a = daiVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorRunQueryOnBackgroundThread = this.a.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorRunQueryOnBackgroundThread != null) {
            filterResults.count = cursorRunQueryOnBackgroundThread.getCount();
            filterResults.values = cursorRunQueryOnBackgroundThread;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        dai daiVar = this.a;
        Cursor cursor = daiVar.getCursor();
        if (filterResults.values == null || filterResults.values == cursor) {
            return;
        }
        daiVar.changeCursor((Cursor) filterResults.values);
    }
}
