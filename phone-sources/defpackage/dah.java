package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dah extends BaseAdapter implements Filterable, dai {

    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    private boolean mAutoRequery;
    private daf mChangeObserver;
    private Context mContext;
    private Cursor mCursor;
    private daj mCursorFilter;
    private DataSetObserver mDataSetObserver;
    boolean mDataValid;
    private FilterQueryProvider mFilterQueryProvider;
    private int mRowIDColumn;

    @Deprecated
    public dah(Context context, Cursor cursor) {
        init(context, cursor, 1);
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public void changeCursor(Cursor cursor) {
        Cursor cursorSwapCursor = swapCursor(cursor);
        if (cursorSwapCursor != null) {
            cursorSwapCursor.close();
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.mDataValid || (cursor = this.mCursor) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // defpackage.dai
    public Cursor getCursor() {
        return this.mCursor;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Cursor cursor;
        if (!this.mDataValid || (cursor = this.mCursor) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        if (view == null) {
            view = newDropDownView(this.mContext, this.mCursor, viewGroup);
        }
        bindView(view, this.mContext, this.mCursor);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.mCursorFilter == null) {
            this.mCursorFilter = new daj(this);
        }
        return this.mCursorFilter;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.mFilterQueryProvider;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.mDataValid || (cursor = this.mCursor) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.mCursor;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.mDataValid && (cursor = this.mCursor) != null && cursor.moveToPosition(i)) {
            return this.mCursor.getLong(this.mRowIDColumn);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Cursor cursor = this.mCursor;
        if (cursor == null) {
            throw new IllegalStateException("this should only be called when the cursor is non-null");
        }
        if (!cursor.moveToPosition(i)) {
            throw new IllegalStateException(a.cf(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = newView(this.mContext, this.mCursor, viewGroup);
        }
        bindView(view, this.mContext, this.mCursor);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void init(Context context, Cursor cursor, int i) {
        if ((i & 1) == 1) {
            i |= 2;
            this.mAutoRequery = true;
        } else {
            this.mAutoRequery = false;
        }
        this.mCursor = cursor;
        boolean z = cursor != null;
        this.mDataValid = z;
        this.mContext = context;
        this.mRowIDColumn = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.mChangeObserver = new daf(this);
            this.mDataSetObserver = new dag(this);
        } else {
            this.mChangeObserver = null;
            this.mDataSetObserver = null;
        }
        if (z) {
            daf dafVar = this.mChangeObserver;
            if (dafVar != null) {
                this.mCursor.registerContentObserver(dafVar);
            }
            DataSetObserver dataSetObserver = this.mDataSetObserver;
            if (dataSetObserver != null) {
                this.mCursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void onContentChanged() {
        Cursor cursor;
        if (!this.mAutoRequery || (cursor = this.mCursor) == null || cursor.isClosed()) {
            return;
        }
        this.mDataValid = this.mCursor.requery();
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.mFilterQueryProvider;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.mCursor;
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        this.mFilterQueryProvider = filterQueryProvider;
    }

    public Cursor swapCursor(Cursor cursor) {
        Cursor cursor2 = this.mCursor;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            daf dafVar = this.mChangeObserver;
            if (dafVar != null) {
                cursor2.unregisterContentObserver(dafVar);
            }
            DataSetObserver dataSetObserver = this.mDataSetObserver;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mCursor = cursor;
        if (cursor == null) {
            this.mRowIDColumn = -1;
            this.mDataValid = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        daf dafVar2 = this.mChangeObserver;
        if (dafVar2 != null) {
            cursor.registerContentObserver(dafVar2);
        }
        DataSetObserver dataSetObserver2 = this.mDataSetObserver;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
        this.mDataValid = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public dah(Context context, Cursor cursor, int i) {
        init(context, cursor, i);
    }

    public dah(Context context, Cursor cursor, boolean z) {
        init(context, cursor, true != z ? 2 : 1);
    }

    @Deprecated
    protected void init(Context context, Cursor cursor, boolean z) {
        init(context, cursor, true != z ? 2 : 1);
    }
}
