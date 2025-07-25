package android.support.v7.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a;
import defpackage.dak;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class SuggestionsAdapter extends dak implements View.OnClickListener {
    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE = 0;
    private boolean mClosed;
    private final int mCommitIconResId;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    /* compiled from: PG */
    final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(R.id.text1);
            this.mText2 = (TextView) view.findViewById(R.id.text2);
            this.mIcon1 = (ImageView) view.findViewById(R.id.icon1);
            this.mIcon2 = (ImageView) view.findViewById(R.id.icon2);
            this.mIconRefine = (ImageView) view.findViewById(com.google.android.videos.R.id.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.mClosed = DBG;
        this.mQueryRefinement = 1;
        this.mText1Col = -1;
        this.mText2Col = -1;
        this.mText2UrlCol = -1;
        this.mIconName1Col = -1;
        this.mIconName2Col = -1;
        this.mFlagsCol = -1;
        this.mSearchView = searchView;
        this.mSearchable = searchableInfo;
        this.mCommitIconResId = searchView.getSuggestionCommitIconResId();
        this.mProviderContext = context;
        this.mOutsideDrawablesCache = weakHashMap;
    }

    private Drawable checkIconCache(String str) {
        Drawable.ConstantState constantState = this.mOutsideDrawablesCache.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence formatUrl(CharSequence charSequence) {
        if (this.mUrlColor == null) {
            TypedValue typedValue = new TypedValue();
            this.mProviderContext.getTheme().resolveAttribute(com.google.android.videos.R.attr.textColorSearchUrl, typedValue, true);
            this.mUrlColor = this.mProviderContext.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.mProviderContext.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(LOG_TAG, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(LOG_TAG, e.toString());
            return null;
        }
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) throws PackageManager.NameNotFoundException {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.mOutsideDrawablesCache;
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!weakHashMap.containsKey(strFlattenToShortString)) {
            Drawable activityIcon = getActivityIcon(componentName);
            this.mOutsideDrawablesCache.put(strFlattenToShortString, activityIcon != null ? activityIcon.getConstantState() : null);
            return activityIcon;
        }
        Drawable.ConstantState constantState = this.mOutsideDrawablesCache.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.mProviderContext.getResources());
    }

    public static String getColumnString(Cursor cursor, String str) {
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    private Drawable getDefaultIcon1() throws PackageManager.NameNotFoundException {
        Drawable activityIconWithCache = getActivityIconWithCache(this.mSearchable.getSearchActivity());
        return activityIconWithCache != null ? activityIconWithCache : this.mProviderContext.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable getDrawable(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return getDrawableFromResourceUri(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException(a.cm(uri, "Resource does not exist: "));
                }
            }
            InputStream inputStreamOpenInputStream = this.mProviderContext.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException(a.cm(uri, "Failed to open "));
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e(LOG_TAG, a.cm(uri, "Error closing icon stream for "), e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w(LOG_TAG, "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w(LOG_TAG, "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable getDrawableFromResourceValue(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            String str2 = "android.resource://" + this.mProviderContext.getPackageName() + "/" + i;
            Drawable drawableCheckIconCache = checkIconCache(str2);
            if (drawableCheckIconCache != null) {
                return drawableCheckIconCache;
            }
            Drawable drawable = this.mProviderContext.getDrawable(i);
            storeInIconCache(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w(LOG_TAG, "Icon resource not found: ".concat(str));
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableCheckIconCache2 = checkIconCache(str);
            if (drawableCheckIconCache2 != null) {
                return drawableCheckIconCache2;
            }
            Drawable drawable2 = getDrawable(Uri.parse(str));
            storeInIconCache(str, drawable2);
            return drawable2;
        }
    }

    private Drawable getIcon1(Cursor cursor) throws NumberFormatException, IOException {
        int i = this.mIconName1Col;
        if (i == -1) {
            return null;
        }
        Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(i));
        return drawableFromResourceValue != null ? drawableFromResourceValue : getDefaultIcon1();
    }

    private Drawable getIcon2(Cursor cursor) {
        int i = this.mIconName2Col;
        if (i == -1) {
            return null;
        }
        return getDrawableFromResourceValue(cursor.getString(i));
    }

    private static String getStringOrNull(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(LOG_TAG, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(DBG, DBG);
        drawable.setVisible(true, DBG);
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void storeInIconCache(String str, Drawable drawable) {
        if (drawable != null) {
            this.mOutsideDrawablesCache.put(str, drawable.getConstantState());
        }
    }

    private void updateSpinnerState(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // defpackage.dah
    public void bindView(View view, Context context, Cursor cursor) {
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i = this.mFlagsCol;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (childViewCache.mText1 != null) {
            setViewText(childViewCache.mText1, getStringOrNull(cursor, this.mText1Col));
        }
        if (childViewCache.mText2 != null) {
            String stringOrNull = getStringOrNull(cursor, this.mText2UrlCol);
            CharSequence url = stringOrNull != null ? formatUrl(stringOrNull) : getStringOrNull(cursor, this.mText2Col);
            if (TextUtils.isEmpty(url)) {
                TextView textView = childViewCache.mText1;
                if (textView != null) {
                    textView.setSingleLine(DBG);
                    childViewCache.mText1.setMaxLines(2);
                }
            } else {
                TextView textView2 = childViewCache.mText1;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    childViewCache.mText1.setMaxLines(1);
                }
            }
            setViewText(childViewCache.mText2, url);
        }
        ImageView imageView = childViewCache.mIcon1;
        if (imageView != null) {
            setViewDrawable(imageView, getIcon1(cursor), 4);
        }
        ImageView imageView2 = childViewCache.mIcon2;
        if (imageView2 != null) {
            setViewDrawable(imageView2, getIcon2(cursor), 8);
        }
        int i3 = this.mQueryRefinement;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            childViewCache.mIconRefine.setVisibility(8);
            return;
        }
        childViewCache.mIconRefine.setVisibility(0);
        childViewCache.mIconRefine.setTag(childViewCache.mText1.getText());
        childViewCache.mIconRefine.setOnClickListener(this);
    }

    @Override // defpackage.dah, defpackage.dai
    public void changeCursor(Cursor cursor) {
        if (this.mClosed) {
            Log.w(LOG_TAG, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.mText1Col = cursor.getColumnIndex("suggest_text_1");
                this.mText2Col = cursor.getColumnIndex("suggest_text_2");
                this.mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
                this.mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
                this.mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
                this.mFlagsCol = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, "error changing cursor and caching columns", e);
        }
    }

    public void close() {
        changeCursor(null);
        this.mClosed = true;
    }

    @Override // defpackage.dah, defpackage.dai
    public CharSequence convertToString(Cursor cursor) {
        String columnString;
        String columnString2;
        if (cursor == null) {
            return null;
        }
        String columnString3 = getColumnString(cursor, "suggest_intent_query");
        if (columnString3 != null) {
            return columnString3;
        }
        if (this.mSearchable.shouldRewriteQueryFromData() && (columnString2 = getColumnString(cursor, "suggest_intent_data")) != null) {
            return columnString2;
        }
        if (!this.mSearchable.shouldRewriteQueryFromText() || (columnString = getColumnString(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return columnString;
    }

    public Drawable getDrawableFromResourceUri(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            Objects.toString(uri);
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
        try {
            Resources resourcesForApplication = this.mProviderContext.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                Objects.toString(uri);
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    Objects.toString(uri);
                    throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                }
            } else {
                if (size != 2) {
                    Objects.toString(uri);
                    throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            Objects.toString(uri);
            throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
        } catch (PackageManager.NameNotFoundException unused2) {
            Objects.toString(uri);
            throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
        }
    }

    @Override // defpackage.dah, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(LOG_TAG, "Search suggestions cursor threw exception.", e);
            View viewNewDropDownView = newDropDownView(this.mProviderContext, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((ChildViewCache) viewNewDropDownView.getTag()).mText1.setText(e.toString());
            }
            return viewNewDropDownView;
        }
    }

    public int getQueryRefinement() {
        return this.mQueryRefinement;
    }

    public Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.mProviderContext.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // defpackage.dah, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(LOG_TAG, "Search suggestions cursor threw exception.", e);
            View viewNewView = newView(this.mProviderContext, getCursor(), viewGroup);
            if (viewNewView != null) {
                ((ChildViewCache) viewNewView.getTag()).mText1.setText(e.toString());
            }
            return viewNewView;
        }
    }

    @Override // defpackage.dah, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return DBG;
    }

    @Override // defpackage.dak, defpackage.dah
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new ChildViewCache(viewNewView));
        ((ImageView) viewNewView.findViewById(com.google.android.videos.R.id.edit_query)).setImageResource(this.mCommitIconResId);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.mSearchView.onQueryRefine((CharSequence) tag);
        }
    }

    @Override // defpackage.dah, defpackage.dai
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.mSearchView.getVisibility() == 0 && this.mSearchView.getWindowVisibility() == 0) {
            try {
                Cursor searchManagerSuggestions = getSearchManagerSuggestions(this.mSearchable, string, 50);
                if (searchManagerSuggestions != null) {
                    searchManagerSuggestions.getCount();
                    return searchManagerSuggestions;
                }
            } catch (RuntimeException e) {
                Log.w(LOG_TAG, "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public void setQueryRefinement(int i) {
        this.mQueryRefinement = i;
    }
}
