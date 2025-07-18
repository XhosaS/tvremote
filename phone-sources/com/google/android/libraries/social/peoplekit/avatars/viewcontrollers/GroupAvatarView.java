package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GroupAvatarView extends View {
    private int a;
    private int b;
    private Paint c;
    private Paint d;
    private int e;

    public GroupAvatarView(Context context) throws Resources.NotFoundException {
        super(context);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
    }

    private final void a(Context context) {
        new Paint(1);
        new Paint(1);
        new Paint(1);
        new Paint(1);
        new Paint(1);
        new ArrayList(4);
        this.e = (int) Math.ceil(context.getResources().getDimensionPixelSize(R.dimen.peoplekit_group_avatar_border_width) / 2.0f);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(-1);
        this.c.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.c;
        int i = this.e;
        paint2.setStrokeWidth(i + i);
        Paint paint3 = new Paint(1);
        this.d = paint3;
        paint3.setColor(context.getResources().getColor(R.color.quantum_grey300));
    }

    private final void b(RectF rectF, int i, int i2) {
        Path path = new Path();
        path.addArc(rectF, i, i2);
        if (i2 != 360) {
            path.lineTo((int) Math.ceil(this.a / 2.0f), (int) Math.ceil(this.b / 2.0f));
        }
        path.close();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = i - paddingLeft;
        this.a = i5;
        int i6 = i2 - paddingTop;
        this.b = i6;
        RectF rectF = new RectF(0.0f, 0.0f, i5, i6);
        b(rectF, 0, 360);
        b(rectF, 90, 180);
        b(rectF, 270, 180);
        b(rectF, 180, 90);
        b(rectF, 270, 90);
        b(rectF, 90, 90);
        b(rectF, 0, 90);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        a(context);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        a(context);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }
}
