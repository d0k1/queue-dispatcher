package com.focusit.queuedispatcher;

import hudson.Extension;
import hudson.model.Node;
import hudson.model.Queue;
import hudson.model.queue.CauseOfBlockage;
import hudson.model.queue.QueueTaskDispatcher;

/**
 * Created by doki on 11.10.17.
 */
@Extension
public class ScriptedQueueDispatcher extends QueueTaskDispatcher {
    @Override
    public CauseOfBlockage canTake(Node node, Queue.BuildableItem item) {
        return super.canTake(node, item);
    }

    @Override
    public CauseOfBlockage canRun(Queue.Item item) {
        return super.canRun(item);
    }
}
