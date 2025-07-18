package com.google.android.apps.play.movies.common.view.subtitles;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import defpackage.fsp;
import defpackage.ksk;
import defpackage.mfz;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DefaultSubtitlesOverlay extends ViewGroup implements SubtitlesOverlay {
    private static final float LINE_HEIGHT_RATIO = 0.0533f;
    private static final int TOTAL_OVERSCAN_PERCENT = 15;
    private fsp captionStyle;
    private float fontScale;
    private final float minReadableFontSize;
    private final SparseArray<SubtitleWindowSnapshot> windowSnapshots;
    private final SparseArray<SubtitleView> windowViews;

    public DefaultSubtitlesOverlay(Context context) {
        this(context, null);
    }

    private SubtitleView createSubtitleView(Object obj, CharSequence charSequence) {
        SubtitleView subtitleView = new SubtitleView(getContext());
        subtitleView.setTag(obj);
        subtitleView.setText(charSequence);
        subtitleView.setStyle(this.captionStyle);
        return subtitleView;
    }

    private void layoutWindowView(View view, SubtitleWindowSettings subtitleWindowSettings, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = subtitleWindowSettings.anchorPoint;
        int i6 = i3 * subtitleWindowSettings.anchorHorizontalPos;
        int i7 = i4 * subtitleWindowSettings.anchorVerticalPos;
        int i8 = i6 / 100;
        int i9 = 0;
        if ((i5 & 1) == 0) {
            i8 = (i5 & 2) != 0 ? i8 - (measuredWidth / 2) : (i5 & 4) != 0 ? i8 - measuredWidth : 0;
        }
        int i10 = i7 / 100;
        if ((i5 & 8) != 0) {
            i9 = i10;
        } else if ((i5 & 16) != 0) {
            i9 = i10 - (measuredHeight / 2);
        } else if ((i5 & 32) != 0) {
            i9 = i10 - measuredHeight;
        }
        int i11 = i8 + i;
        int i12 = i9 + i2;
        view.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    private void measureWindowView(View view, SubtitleWindowSettings subtitleWindowSettings, int i, int i2) {
        int i3 = subtitleWindowSettings.anchorPoint;
        int i4 = subtitleWindowSettings.anchorHorizontalPos * i;
        int i5 = subtitleWindowSettings.anchorVerticalPos * i2;
        int i6 = i4 / 100;
        int i7 = 0;
        if ((i3 & 1) != 0) {
            i6 = i - i6;
        } else if ((i3 & 2) != 0) {
            int iMin = Math.min(i6, i - i6);
            i6 = iMin + iMin;
        } else if ((i3 & 4) == 0) {
            i6 = 0;
        }
        int i8 = i5 / 100;
        if ((i3 & 8) != 0) {
            i7 = i2 - i8;
        } else if ((i3 & 16) != 0) {
            int iMin2 = Math.min(i8, i2 - i8);
            i7 = iMin2 + iMin2;
        } else if ((i3 & 32) != 0) {
            i7 = i8;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
    }

    private void updateSubtitlesTextSize() {
        float fMax = Math.max(this.minReadableFontSize, getHeight() * LINE_HEIGHT_RATIO) * this.fontScale;
        for (int i = 0; i < this.windowViews.size(); i++) {
            this.windowViews.valueAt(i).setTextSize(fMax);
        }
    }

    @Override // com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay
    public void clear() {
        removeAllViews();
        this.windowSnapshots.clear();
        this.windowViews.clear();
        setVisibility(4);
    }

    @Override // defpackage.mga
    public mfz generateLayoutParams() {
        return new mfz(-1, -1, false);
    }

    @Override // defpackage.mga
    public boolean isAvodOverlay() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.windowSnapshots.size(); i5++) {
            SubtitleView subtitleView = this.windowViews.get(this.windowSnapshots.keyAt(i5));
            if (subtitleView.getVisibility() == 0) {
                int i6 = i4 - i2;
                int i7 = i3 - i;
                layoutWindowView(subtitleView, this.windowSnapshots.valueAt(i5).settings, ((i7 * 15) / 100) / 2, ((i6 * 15) / 100) / 2, (i7 * 85) / 100, (i6 * 85) / 100);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        updateSubtitlesTextSize();
        int i3 = size * 85;
        int i4 = size2 * 85;
        for (int i5 = 0; i5 < this.windowSnapshots.size(); i5++) {
            SubtitleView subtitleView = this.windowViews.get(this.windowSnapshots.keyAt(i5));
            if (subtitleView.getVisibility() == 0) {
                SubtitleWindowSettings subtitleWindowSettings = this.windowSnapshots.valueAt(i5).settings;
                measureWindowView(subtitleView, subtitleWindowSettings, i3 / 100, i4 / 100);
            }
        }
    }

    @Override // com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay
    public void setCaptionStyle(fsp fspVar) {
        this.captionStyle = fspVar;
        for (int i = 0; i < this.windowViews.size(); i++) {
            this.windowViews.valueAt(i).setStyle(fspVar);
        }
        requestLayout();
    }

    @Override // com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay
    public void setFontScale(float f) {
        this.fontScale = f;
        requestLayout();
    }

    @Override // com.google.android.apps.play.movies.common.view.subtitles.SubtitlesOverlay
    public void update(List<SubtitleWindowSnapshot> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.windowSnapshots.size(); i++) {
            hashSet.add(Integer.valueOf(this.windowSnapshots.keyAt(i)));
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            SubtitleWindowSnapshot subtitleWindowSnapshot = list.get(i2);
            hashSet.remove(Integer.valueOf(subtitleWindowSnapshot.windowId));
            SubtitleView subtitleView = this.windowViews.get(subtitleWindowSnapshot.windowId);
            if (!TextUtils.isEmpty(subtitleWindowSnapshot.text) && subtitleWindowSnapshot.settings.visible) {
                this.windowSnapshots.put(subtitleWindowSnapshot.windowId, subtitleWindowSnapshot);
                if (subtitleView == null) {
                    String str = subtitleWindowSnapshot.text;
                    SubtitleView subtitleViewCreateSubtitleView = createSubtitleView(str, ksk.b(str));
                    addView(subtitleViewCreateSubtitleView);
                    this.windowViews.put(subtitleWindowSnapshot.windowId, subtitleViewCreateSubtitleView);
                } else {
                    if (!subtitleWindowSnapshot.text.equals(subtitleView.getTag())) {
                        subtitleView.setTag(subtitleWindowSnapshot.text);
                        subtitleView.setText(ksk.b(subtitleWindowSnapshot.text));
                    }
                    subtitleView.setVisibility(0);
                }
            } else if (subtitleView != null) {
                subtitleView.setVisibility(8);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            removeView(this.windowViews.get(iIntValue));
            this.windowSnapshots.remove(iIntValue);
            this.windowViews.remove(iIntValue);
        }
        setVisibility(0);
    }

    public DefaultSubtitlesOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.windowSnapshots = new SparseArray<>();
        this.windowViews = new SparseArray<>();
        this.fontScale = 1.0f;
        this.captionStyle = fsp.a;
        this.minReadableFontSize = context.getResources().getDimension(R.dimen.subtitle_min_readable_font_size);
        setVisibility(4);
    }

    @Override // defpackage.mga
    public View getView() {
        return this;
    }

    @Override // defpackage.mga
    public /* synthetic */ void hideFeedbackText(boolean z) {
    }
}
