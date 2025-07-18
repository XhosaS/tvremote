package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {R.attr.spinnerMode};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    private SpinnerPopup mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    final Rect mTempRect;

    /* compiled from: PG */
    final class Api23Impl {
        private Api23Impl() {
        }

        static void setDropDownViewTheme(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* compiled from: PG */
    class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {
        private ListAdapter mListAdapter;
        AlertDialog mPopup;
        private CharSequence mPrompt;

        public DialogPopup() {
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
            AlertDialog alertDialog = this.mPopup;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.mPopup = null;
            }
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public Drawable getBackground() {
            return null;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public CharSequence getHintText() {
            return this.mPrompt;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
            return 0;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public int getVerticalOffset() {
            return 0;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public boolean isShowing() {
            AlertDialog alertDialog = this.mPopup;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.mListAdapter.getItemId(i));
            }
            dismiss();
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(ListAdapter listAdapter) {
            this.mListAdapter = listAdapter;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOffset(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(CharSequence charSequence) {
            this.mPrompt = charSequence;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setVerticalOffset(int i) {
            Log.e(AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void show(int i, int i2) {
            if (this.mListAdapter == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.mPrompt;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            builder.setSingleChoiceItems(this.mListAdapter, AppCompatSpinner.this.getSelectedItemPosition(), this);
            AlertDialog alertDialogCreate = builder.create();
            this.mPopup = alertDialogCreate;
            ListView listView = alertDialogCreate.getListView();
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.mPopup.show();
        }
    }

    /* compiled from: PG */
    class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter mAdapter;
        private ListAdapter mListAdapter;

        public DropDownAdapter(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.mAdapter = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.mListAdapter = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    Api23Impl.setDropDownViewTheme((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.mListAdapter;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.mAdapter;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: PG */
    class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        ListAdapter mAdapter;
        private CharSequence mHintText;
        private int mOriginalHorizontalOffset;
        private final Rect mVisibleRect;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mVisibleRect = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    AppCompatSpinner.this.setSelection(i2);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        AppCompatSpinner.this.performItemClick(view, i2, dropdownPopup.mAdapter.getItemId(i2));
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }

        public void computeContentWidth() {
            int i;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.mTempRect);
                i = ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? AppCompatSpinner.this.mTempRect.right : -AppCompatSpinner.this.mTempRect.left;
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            if (appCompatSpinner.mDropDownWidth == -2) {
                int i2 = (width - paddingLeft) - paddingRight;
                int iCompatMeasureContentWidth = AppCompatSpinner.this.compatMeasureContentWidth((SpinnerAdapter) this.mAdapter, getBackground());
                int i3 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.mTempRect.left) - AppCompatSpinner.this.mTempRect.right;
                if (iCompatMeasureContentWidth > i3) {
                    iCompatMeasureContentWidth = i3;
                }
                setContentWidth(Math.max(iCompatMeasureContentWidth, i2));
            } else {
                int i4 = AppCompatSpinner.this.mDropDownWidth;
                if (i4 == -1) {
                    setContentWidth((width - paddingLeft) - paddingRight);
                } else {
                    setContentWidth(i4);
                }
            }
            setHorizontalOffset(ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? i + (((width - paddingRight) - getWidth()) - getHorizontalOriginalOffset()) : i + paddingLeft + getHorizontalOriginalOffset());
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public CharSequence getHintText() {
            return this.mHintText;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
            return this.mOriginalHorizontalOffset;
        }

        public boolean isVisibleToUser(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.mVisibleRect);
        }

        @Override // android.support.v7.widget.ListPopupWindow, android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.mAdapter = listAdapter;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int i) {
            this.mOriginalHorizontalOffset = i;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(CharSequence charSequence) {
            this.mHintText = charSequence;
        }

        @Override // android.support.v7.widget.AppCompatSpinner.SpinnerPopup
        public void show(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            computeContentWidth();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.AppCompatSpinner.DropdownPopup.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    DropdownPopup dropdownPopup = DropdownPopup.this;
                    if (!dropdownPopup.isVisibleToUser(AppCompatSpinner.this)) {
                        DropdownPopup.this.dismiss();
                    } else {
                        DropdownPopup.this.computeContentWidth();
                        DropdownPopup.super.show();
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: android.support.v7.widget.AppCompatSpinner.DropdownPopup.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }
    }

    /* compiled from: PG */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<AppCompatSpinner> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", com.google.android.videos.R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", com.google.android.videos.R.attr.backgroundTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatSpinner appCompatSpinner, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readObject(this.mBackgroundTintId, appCompatSpinner.getBackgroundTintList());
            propertyReader.readObject(this.mBackgroundTintModeId, appCompatSpinner.getBackgroundTintMode());
        }
    }

    /* compiled from: PG */
    interface SpinnerPopup {
        void dismiss();

        Drawable getBackground();

        CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i);

        void setHorizontalOriginalOffset(int i);

        void setPromptText(CharSequence charSequence);

        void setVerticalOffset(int i);

        void show(int i, int i2);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i2 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i = i2;
        }
        if (drawable == null) {
            return iMax3;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return iMax3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.applySupportBackgroundTint();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.mPopup;
        return spinnerPopup != null ? spinnerPopup.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.mPopup;
        return spinnerPopup != null ? spinnerPopup.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.mPopup != null ? this.mDropDownWidth : super.getDropDownWidth();
    }

    final SpinnerPopup getInternalPopup() {
        return this.mPopup;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.mPopup;
        return spinnerPopup != null ? spinnerPopup.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.mPopup;
        return spinnerPopup != null ? spinnerPopup.getHintText() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintList();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup == null || !spinnerPopup.isShowing()) {
            return;
        }
        this.mPopup.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mPopup == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.mShowDropdown || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                    AppCompatSpinner.this.showPopup();
                }
                ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.mPopup;
        boolean z = false;
        if (spinnerPopup != null && spinnerPopup.isShowing()) {
            z = true;
        }
        savedState.mShowDropdown = z;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.isShowing()) {
            return true;
        }
        showPopup();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.onSetBackgroundResource(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            spinnerPopup.setHorizontalOriginalOffset(i);
            this.mPopup.setHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setVerticalOffset(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.mPopup;
        if (spinnerPopup != null) {
            spinnerPopup.setPromptText(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.setSupportBackgroundTintMode(mode);
        }
    }

    public void showPopup() {
        this.mPopup.show(getTextDirection(), getTextAlignment());
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.AppCompatSpinner.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean mShowDropdown;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mShowDropdown = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.mShowDropdown ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, com.google.android.videos.R.attr.spinnerStyle, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.setAdapter(new DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.mTempRect = r0
            android.content.Context r0 = r6.getContext()
            android.support.v7.widget.ThemeUtils.checkAppCompatTheme(r6, r0)
            int[] r0 = android.support.v7.appcompat.R.styleable.Spinner
            r1 = 0
            android.support.v7.widget.TintTypedArray r0 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r7, r8, r0, r9, r1)
            android.support.v7.widget.AppCompatBackgroundHelper r2 = new android.support.v7.widget.AppCompatBackgroundHelper
            r2.<init>(r6)
            r6.mBackgroundTintHelper = r2
            if (r11 == 0) goto L29
            hc r2 = new hc
            r2.<init>(r7, r11)
            r6.mPopupContext = r2
            goto L3a
        L29:
            r11 = 4
            int r11 = r0.getResourceId(r11, r1)
            if (r11 == 0) goto L38
            hc r2 = new hc
            r2.<init>(r7, r11)
            r6.mPopupContext = r2
            goto L3a
        L38:
            r6.mPopupContext = r7
        L3a:
            r11 = -1
            r2 = 0
            r3 = 1
            if (r10 != r11) goto L67
            int[] r10 = android.support.v7.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L60
            android.content.res.TypedArray r10 = r7.obtainStyledAttributes(r8, r10, r9, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L60
            boolean r4 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
            if (r4 == 0) goto L4f
            int r11 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L61
        L4f:
            if (r10 == 0) goto L54
            r10.recycle()
        L54:
            r10 = r11
            goto L67
        L56:
            r7 = move-exception
            r2 = r10
            goto L5a
        L59:
            r7 = move-exception
        L5a:
            if (r2 == 0) goto L5f
            r2.recycle()
        L5f:
            throw r7
        L60:
            r10 = r2
        L61:
            if (r10 == 0) goto Lad
            r10.recycle()
            goto Lad
        L67:
            r11 = 2
            if (r10 == 0) goto L9f
            if (r10 == r3) goto L6d
            goto Lad
        L6d:
            android.support.v7.widget.AppCompatSpinner$DropdownPopup r10 = new android.support.v7.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r4 = r6.mPopupContext
            r10.<init>(r4, r8, r9)
            android.content.Context r4 = r6.mPopupContext
            int[] r5 = android.support.v7.appcompat.R.styleable.Spinner
            android.support.v7.widget.TintTypedArray r1 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r4, r8, r5, r9, r1)
            r4 = 3
            r5 = -2
            int r4 = r1.getLayoutDimension(r4, r5)
            r6.mDropDownWidth = r4
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r3)
            r10.setBackgroundDrawable(r4)
            java.lang.String r11 = r0.getString(r11)
            r10.setPromptText(r11)
            r1.recycle()
            r6.mPopup = r10
            android.support.v7.widget.AppCompatSpinner$1 r11 = new android.support.v7.widget.AppCompatSpinner$1
            r11.<init>(r6)
            r6.mForwardingListener = r11
            goto Lad
        L9f:
            android.support.v7.widget.AppCompatSpinner$DialogPopup r10 = new android.support.v7.widget.AppCompatSpinner$DialogPopup
            r10.<init>()
            r6.mPopup = r10
            java.lang.String r11 = r0.getString(r11)
            r10.setPromptText(r11)
        Lad:
            int r10 = android.support.v7.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.getTextArray(r10)
            if (r10 == 0) goto Lc6
            android.widget.ArrayAdapter r11 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r11.<init>(r7, r1, r10)
            r7 = 2131625912(0x7f0e07b8, float:1.8879045E38)
            r11.setDropDownViewResource(r7)
            r6.setAdapter(r11)
        Lc6:
            r0.recycle()
            r6.mPopupSet = r3
            android.widget.SpinnerAdapter r7 = r6.mTempAdapter
            if (r7 == 0) goto Ld4
            r6.setAdapter(r7)
            r6.mTempAdapter = r2
        Ld4:
            android.support.v7.widget.AppCompatBackgroundHelper r7 = r6.mBackgroundTintHelper
            r7.loadFromAttributes(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
