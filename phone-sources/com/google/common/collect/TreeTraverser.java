package com.google.common.collect;

import defpackage.tsl;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class TreeTraverser<T> {

    /* compiled from: PG */
    final class BreadthFirstIterator extends UnmodifiableIterator<T> implements PeekingIterator<T> {
        private final Queue<T> queue;
        final /* synthetic */ TreeTraverser this$0;

        public BreadthFirstIterator(TreeTraverser treeTraverser, T t) {
            treeTraverser.getClass();
            this.this$0 = treeTraverser;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.queue = arrayDeque;
            arrayDeque.add(t);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
            TreeTraverser treeTraverser = this.this$0;
            T tRemove = this.queue.remove();
            Iterables.addAll(this.queue, treeTraverser.children(tRemove));
            return tRemove;
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
            return this.queue.element();
        }
    }

    /* compiled from: PG */
    final class PostOrderIterator extends AbstractIterator<T> {
        private final ArrayDeque<PostOrderNode<T>> stack;
        final /* synthetic */ TreeTraverser this$0;

        public PostOrderIterator(TreeTraverser treeTraverser, T t) {
            treeTraverser.getClass();
            this.this$0 = treeTraverser;
            ArrayDeque<PostOrderNode<T>> arrayDeque = new ArrayDeque<>();
            this.stack = arrayDeque;
            arrayDeque.addLast(expand(t));
        }

        private PostOrderNode<T> expand(T t) {
            return new PostOrderNode<>(t, this.this$0.children(t).iterator());
        }

        @Override // com.google.common.collect.AbstractIterator
        protected T computeNext() {
            while (!this.stack.isEmpty()) {
                PostOrderNode<T> last = this.stack.getLast();
                if (!last.childIterator.hasNext()) {
                    this.stack.removeLast();
                    return last.root;
                }
                this.stack.addLast(expand(last.childIterator.next()));
            }
            endOfData();
            return null;
        }
    }

    /* compiled from: PG */
    final class PostOrderNode<T> {
        final Iterator<T> childIterator;
        final T root;

        public PostOrderNode(T t, Iterator<T> it) {
            t.getClass();
            this.root = t;
            it.getClass();
            this.childIterator = it;
        }
    }

    /* compiled from: PG */
    final class PreOrderIterator extends UnmodifiableIterator<T> {
        private final Deque<Iterator<T>> stack;
        final /* synthetic */ TreeTraverser this$0;

        public PreOrderIterator(TreeTraverser treeTraverser, T t) {
            treeTraverser.getClass();
            this.this$0 = treeTraverser;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.stack = arrayDeque;
            t.getClass();
            arrayDeque.addLast(Iterators.singletonIterator(t));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.stack.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.stack.getLast();
            T next = last.next();
            next.getClass();
            if (!last.hasNext()) {
                this.stack.removeLast();
            }
            Iterator<T> it = this.this$0.children(next).iterator();
            if (it.hasNext()) {
                this.stack.addLast(it);
            }
            return next;
        }
    }

    @Deprecated
    public static <T> TreeTraverser<T> using(final tsl<T, ? extends Iterable<T>> tslVar) {
        tslVar.getClass();
        return new TreeTraverser<T>() { // from class: com.google.common.collect.TreeTraverser.1
            @Override // com.google.common.collect.TreeTraverser
            public Iterable<T> children(T t) {
                return (Iterable) tslVar.apply(t);
            }
        };
    }

    @Deprecated
    public final FluentIterable<T> breadthFirstTraversal(final T t) {
        t.getClass();
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.4
            final /* synthetic */ TreeTraverser this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return new BreadthFirstIterator(this.this$0, t);
            }
        };
    }

    public abstract Iterable<T> children(T t);

    public UnmodifiableIterator<T> postOrderIterator(T t) {
        return new PostOrderIterator(this, t);
    }

    @Deprecated
    public final FluentIterable<T> postOrderTraversal(final T t) {
        t.getClass();
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.3
            final /* synthetic */ TreeTraverser this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return this.this$0.postOrderIterator(t);
            }
        };
    }

    public UnmodifiableIterator<T> preOrderIterator(T t) {
        return new PreOrderIterator(this, t);
    }

    @Deprecated
    public final FluentIterable<T> preOrderTraversal(final T t) {
        t.getClass();
        return new FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.2
            final /* synthetic */ TreeTraverser this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public UnmodifiableIterator<T> iterator() {
                return this.this$0.preOrderIterator(t);
            }
        };
    }
}
